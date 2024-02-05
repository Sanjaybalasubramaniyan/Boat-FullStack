// components/ViewBooking.js
import React, { useState, useEffect } from 'react';
// import axios from 'axios';
import { Link } from 'react-router-dom';
import './viewBooking.css'; // Import the CSS file
import Navbar from './Nabar';

const ViewBooking = () => {
    const [bookings, setBookings] = useState([]);

    useEffect(() => {
        // Fetch bookings data from backend API
        fetchBookings();
    }, []);

    const fetchBookings = async () => {
        try {
            const response = await axios.get('/api/bookings');
            setBookings(response.data);
        } catch (error) {
            console.error('Error fetching bookings:', error);
        }
    };

    return (
        <div>
            <Navbar/>
        <div className="bookings-container">
            <h2>View Bookings</h2>
            <table>
                <thead>
                    <tr>
                        <th>Booking ID</th>
                        <th>Boat ID</th>
                        <th>Number of Persons</th>
                        <th>From Date</th>
                        <th>To Date</th>
                    </tr>
                </thead>
                <tbody>
                    {bookings.map(booking => (
                        <tr key={booking.bookingId}>
                            <td>{booking.bookingId}</td>
                            <td>{booking.boatId}</td>
                            <td>{booking.numberOfPersons}</td>
                            <td>{booking.fromDate}</td>
                            <td>{booking.toDate}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
        </div>
    );
};

export default ViewBooking;
