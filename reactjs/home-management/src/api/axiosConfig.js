import axios from 'axios';


// Using axios api to make HTTP request to connect with Backend
export default axios.create({
    // baseURL: 'https://9c96-103-106-239-104.ap.ngrok.io',
    baseURL: 'http://localhost:8080', // your server api puts here.
    headers: {"ngrok-skip-browser-warning": "true"}
});