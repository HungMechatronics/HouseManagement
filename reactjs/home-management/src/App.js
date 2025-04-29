import logo from './logo.svg';
import './App.css';
import api from './api/axiosConfig';
import { useState, useEffect } from 'react';
import Login from './components/Login/Login';

function App() {

  return (
    // Customize inside div App to create the GUI.
    <div className="App">
        <Login />
    </div>
  );
}

export default App;
