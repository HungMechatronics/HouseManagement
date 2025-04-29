import axios from 'axios';


// Using axios api to make HTTP request to connect with Backend
export default axios.create({
    baseURL: 'http://localhost:8080', // your server api puts here.
    headers: {"ngrok-skip-browser-warning": "true"}
});