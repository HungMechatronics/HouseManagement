import React, { useState } from 'react';
import './Login.css';
import api from '../../api/axiosConfig';

function Login() {
  const [phoneNumber, setPhoneNumber] = useState('');
  const [password, setPassword] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    console.log('PhoneNumber:', phoneNumber);
    console.log('Password:', password);


    try {
          const response = await api.get(`/user/login/${phoneNumber}~${password}`);
          console.log('Login successful:', response.data);
          alert('Login successful!');
          // You can redirect or store token here
        } catch (error) {
          console.error('Login failed:', error);
          alert('Login failed. Please check your credentials.');
        }
  };

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
    </div>
  );
}

export default Login;
