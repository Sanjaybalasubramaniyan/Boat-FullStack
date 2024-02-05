import React, { useState } from 'react';
import Navbar from './Nabar';
import './MakePayment.css'; // Import CSS for local styles

const MakePayment = () => {
    const [paymentData, setPaymentData] = useState({
        bookingId: '',
        amountPaid: 0,
        paymentMethod: ''
    });
    const [errors, setErrors] = useState({});

    const handleChange = (e) => {
        const { name, value } = e.target;
        setPaymentData(prevData => ({
            ...prevData,
            [name]: value
        }));
        // Clear the error message when the user starts typing again
        setErrors(prevErrors => ({
            ...prevErrors,
            [name]: ''
        }));
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        const validationErrors = validate(paymentData);
        if (Object.keys(validationErrors).length === 0) {
            // Proceed with payment submission
            submitPayment(paymentData);
        } else {
            // Display validation errors
            setErrors(validationErrors);
        }
    };

    const validate = (data) => {
        let errors = {};
        if (!data.bookingId.trim()) {
            errors.bookingId = 'Booking ID is required';
        }
        if (data.amountPaid <= 0) {
            errors.amountPaid = 'Amount Paid must be greater than 0';
        }
        if (!data.paymentMethod) {
            errors.paymentMethod = 'Payment Method is required';
        }
        return errors;
    };

    const submitPayment = (data) => {
        // Perform payment submission logic here
        console.log('Payment submitted:', data);
        // Reset the form after successful submission
        setPaymentData({
            bookingId: '',
            amountPaid: 0,
            paymentMethod: ''
        });
        alert('Payment successful!');
    };

    return (
        <div className="full-page-background">
            <Navbar />
            <div className="payment-container">
                <h2>Make Payment</h2>
                <form onSubmit={handleSubmit}>
                    <div className="form-group">
                        <label>Booking ID:</label>
                        <input type="text" name="bookingId" value={paymentData.bookingId} onChange={handleChange} />
                        {errors.bookingId && <span className="error-message">{errors.bookingId}</span>}
                    </div>
                    <div className="form-group">
                        <label>Amount Paid:</label>
                        <input type="number" name="amountPaid" value={paymentData.amountPaid} onChange={handleChange} />
                        {errors.amountPaid && <span className="error-message">{errors.amountPaid}</span>}
                    </div>
                    <div className="form-group">
                        <label>Payment Method:</label>
                        <select name="paymentMethod" value={paymentData.paymentMethod} onChange={handleChange}>
                            <option value="">Select Payment Method</option>
                            <option value="credit_card">Credit Card</option>
                            <option value="debit_card">Debit Card</option>
                            <option value="paypal">PayPal</option>
                        </select>
                        {errors.paymentMethod && <span className="error-message">{errors.paymentMethod}</span>}
                    </div>
                    <button type="submit">Make Payment</button>
                </form>
            </div>
        </div>
    );
};

export default MakePayment;
