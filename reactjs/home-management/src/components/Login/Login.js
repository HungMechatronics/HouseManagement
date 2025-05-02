import React, { useState } from 'react';
import './Login.css';
import api from '../../api/axiosConfig';
import { useNavigate } from 'react-router-dom';

function Login() {
  const navigate = useNavigate();
  const [phoneNumber, setPhoneNumber] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    console.log('PhoneNumber:', phoneNumber);
    console.log('Password:', password);


    try {
          // Get data from back-end
          const response = await api.post(`/user/login`, {
            phoneNumber: phoneNumber,
            password: password
          });

          console.log(response.data.role)
          if (response.data && response.data.role == 'admin'){
            navigate('/home/admin');
          } else {
            navigate('/home/other');
          }

          const loginScreen = await api.get(`/user/${response.data.userID}`)

          console.log('Login successful:', response.data.userID);
          alert('Login successful!');
          // You can redirect or store token here
        } catch (error) {
          console.error('Login failed:', error);
          alert('Login failed. Please check your credentials.');
        }
  };

  const handleRegistration = async (e) => {
    e.preventDefault();

    try{
    navigate('/registration');
    } catch (error) {
        console.error('Registration failed:', error);
        alert('Registration failed. Please check your credentials.');
    }
  }

  return (
    <div className="login-container">
      <h2>Login</h2>
      <form onSubmit={handleSubmit} className="login-form">
        <input
          type="text"
          placeholder="PhoneNumber"
          value={phoneNumber}
          onChange={(e) => setPhoneNumber(e.target.value)}
          required
        />
        <input
          type="password"
          placeholder="Password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
          required
        />
        <button type="submit">Login</button>
      </form>
      <form onSubmit={handleRegistration} className="registration-form">
            <button type="submit">Registration</button>
      </form>
    </div>
  );
}

export default Login;
