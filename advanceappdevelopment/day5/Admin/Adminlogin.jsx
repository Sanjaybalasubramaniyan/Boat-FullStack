import React, { useState } from 'react';
import { NavLink } from 'react-router-dom';
import './Adminlogin.css';

const Adminlogin = () => {
    const [credentials, setCredentials] = useState({
        email: '',
        password: '',
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setCredentials({ ...credentials, [name]: value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        console.log(credentials);
    };

    return (
        <div className="auth-container">
            <h2>Admin Login</h2>
            <form onSubmit={handleSubmit} className="auth-form">
                <input
                    type="email"
                    name="email"
                    placeholder="Email Address"
                    value={credentials.email}
                    onChange={handleChange}
                    required
                />
                <input
                    type="password"
                    name="password"
                    placeholder="Password"
                    value={credentials.password}
                    onChange={handleChange}
                    required
                />
                <NavLink to="/dashboard"><button type="submit">Login</button></NavLink>
            </form>
        </div>
    );
};

export default Adminlogin