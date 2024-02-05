// components/AdminNavbar.js
import React from 'react';
import { Link } from 'react-router-dom'; 
import './AdminNavbar.css';

const AdminNavbar = () => {
    return (
        <nav className="navbar">
            <div className="container">
                <Link to="/Booking" className="navbar-brand">Boat Booking App</Link>
            </div>
            <ul className="navbar-nav">
                <li className="nav-item">
                    <Link to="/register" className="nav-link">Register</Link>
                </li>
                <li className="nav-item">
                    <Link to="/login" className="nav-link">Logout</Link>
                </li>
                <li className="nav-item">
                    <Link to="/dashboard" className="nav-link">Dashboard</Link>
                </li>
                <li className="nav-item">
                    <Link to="/boats" className="nav-link">Boat House Page</Link>
                </li>
                <li className="nav-item">
                    <Link to="/bookings" className="nav-link">Customer Booking Details</Link>
                </li>
                <li className="nav-item">
                    <Link to="/payment-history" className="nav-link">Payment History Page</Link>
                </li>
            </ul>
        </nav>
    );
};

export default AdminNavbar;
