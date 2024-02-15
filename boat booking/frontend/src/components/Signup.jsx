import React, { useState } from 'react';
import { NavLink } from 'react-router-dom';

const Signup = () => {
    const [accountData, setAccountData] = useState({
        email: '',
        password: '',
        confirmPassword: '',
    });

    const handleChange = (e) => {
        const { name, value } = e.target;
        setAccountData({ ...accountData, [name]: value });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        // Here you would check if the passwords match, then make an API call to your backend for signup
        // if (accountData.password !== accountData.confirmPassword) {
        //     alert("Passwords don't match.");
        //     return;
        // }
        console.log(accountData);
    };

    return (
        <div style={{
            margin: 0,
            padding: 0,
            fontFamily: 'Arial, sans-serif',
            backgroundColor: '#f0f0f0',
            backgroundImage: `url('https://images.pexels.com/photos/244517/pexels-photo-244517.jpeg?cs=srgb&dl=pexels-photoklickr-244517.jpg&fm=jpg')`,
            backgroundSize: 'cover',
            backgroundPosition: 'center',
            height: '100vh',
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
        }}>
            <div className="auth-container" style={{
                maxWidth: '400px',
                padding: '20px',
                borderRadius: '10px',
                
                boxShadow: '0 0 20px rgba(0, 0, 0, 0.1)',
                textAlign: 'center',
                animation: 'fadeIn 1s ease',
            }}>
                <h2>Sign Up</h2>
                <form onSubmit={handleSubmit} className="auth-form">
                    <input
                        type="email"
                        name="email"
                        placeholder="Email Address"
                        value={accountData.email}
                        onChange={handleChange}
                        required
                    />
                    <input
                        type="password"
                        name="password"
                        placeholder="Password"
                        value={accountData.password}
                        onChange={handleChange}
                        required
                    />
                    <input
                        type="password"
                        name="confirmPassword"
                        placeholder="Confirm Password"
                        value={accountData.confirmPassword}
                        onChange={handleChange}
                        required
                    />
                    <button type="submit">Sign Up</button>
                </form>
                <p>
                    Already have an account? <NavLink to="/" className="switch">Login</NavLink>
                </p>
            </div>
        </div>
    );
};

export default Signup;
