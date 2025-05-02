import logo from './logo.svg';
import './App.css';
import api from './api/axiosConfig';
import { useState, useEffect } from 'react';
import Login from './components/Login/Login';
import HomePage from './components/HomePage/HomePage';
import AdminPage from './components/HomePage/AdminPage';
import RegistrationForm from './components/Registration/Registration';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

function App() {

  return (
    // Customize inside div App to create the GUI.
    <Router>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/home/other" element={<HomePage />} />
        <Route path="/home/admin" element={<AdminPage />} />
        <Route path="/registration" element={<RegistrationForm />} />
      </Routes>
    </Router>
  );
}

export default App;
