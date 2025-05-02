import React, { useState } from 'react';

const RegistrationForm = () => {
  const [formData, setFormData] = useState({
    firstName: '',
    lastName: '',
    dob: '',
    address: '',
    idNumber: '',
    occupation: '',
    biography: '',
    email: '',
    phoneNumber: '',
    password: '',
    room: ''
  });

  const rooms = ['Room A', 'Room B', 'Room C', 'Room D'];

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData(prev => ({
      ...prev,
      [name]: value
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log('Form submitted:', formData);
    // You can send `formData` to a backend API here
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>Registration Form</h2>

      <label>First Name:</label>
      <input type="text" name="firstName" value={formData.firstName} onChange={handleChange} required />
      <br />

      <label>Last Name:</label>
      <input type="text" name="lastName" value={formData.lastName} onChange={handleChange} required />
      <br />

      <label>Date of Birth:</label>
      <input type="date" name="dob" value={formData.dob} onChange={handleChange} required />
      <br />

      <label>Address:</label>
      <input type="text" name="address" value={formData.address} onChange={handleChange} required />
      <br />

      <label>ID Number:</label>
      <input type="text" name="idNumber" value={formData.idNumber} onChange={handleChange} required />
      <br />

      <label>Occupation:</label>
      <input type="text" name="occupation" value={formData.occupation} onChange={handleChange} required />
      <br />

      <label>Biography:</label>
      <textarea name="biography" value={formData.biography} onChange={handleChange} required />
      <br />

      <label>Email:</label>
      <input type="email" name="email" value={formData.email} onChange={handleChange} required />
      <br />

      <label>Phone Number:</label>
      <input type="tel" name="phoneNumber" value={formData.phoneNumber} onChange={handleChange} required />
      <br />

      <label>Password:</label>
      <input type="password" name="password" value={formData.password} onChange={handleChange} required />
      <br />

      <label>Room:</label>
      <select name="room" value={formData.room} onChange={handleChange} required>
        <option value="">Select a room</option>
        {rooms.map((room, index) => (
          <option key={index} value={room}>{room}</option>
        ))}
      </select>
      <br /><br />

      <button type="submit">Register</button>
    </form>
  );
};

export default RegistrationForm;
