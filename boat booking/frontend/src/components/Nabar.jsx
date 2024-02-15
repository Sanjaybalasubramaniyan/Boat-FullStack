import React from 'react';
import { Link } from 'react-router-dom';
import './navabar.css'

const Navbar = ({ role }) => {
    return (
        <nav className="navbar">
            <div className="container">
                <Link to="/Booking" className="navbar-brand">Boat Booking App</Link>
                <ul className="navbar-nav">
                    {role === 'admin' ? (
                        <>
                        </>
                    ) : (
                        <>
                            <li className="nav-item">
                                <Link to="/add-booking" className="nav-link">Add Booking</Link>
                            </li>
                            <li className="nav-item">
                                <Link to="/view-booking" className="nav-link">View Booking</Link>
                            </li>
                            <li className="nav-item">
                                <Link to="/about-us" className="nav-link">About us</Link>
                            </li>
                            {/* <li className="nav-item">
                                <Link to="/Admin" className="nav-link">Admin</Link>
                            </li> */}
                        </>
                    )}
                    <li className="nav-item">
                        <Link to="/" className="nav-link">Logout</Link>
                    </li>
                    <li className="nav-item">
                        <Link to="/Profile" className="nav-link">Profile</Link>
                    </li>
                </ul>
            </div>
        </nav>
    );
};

export default Navbar;
