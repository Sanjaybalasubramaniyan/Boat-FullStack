import React from 'react';
import './BoatCard.css'; // Import the CSS file

const BoatCard = ({ boatId, numberOfPersons, fromDate, toDate, boatType, amenities, location, availability, price, captainAndCrew, cancellationPolicy }) => {
    return (
        <div className="boat-card">
            <div className="boat-image">
                {/* Add image of the boat */}
                <img src="boat-image.jpg" alt="Boat" />
            </div>
            <div className="boat-details">
                <h3>{boatId}</h3>
                <p>Number of Persons: {numberOfPersons}</p>
                <p>From Date: {fromDate}</p>
                <p>To Date: {toDate}</p>
                <p>Boat Type: {boatType}</p>
                <p>Amenities: {amenities.join(', ')}</p>
                <p>Location: {location}</p>
                <p>Availability: {availability}</p>
                <p>Price: {price}</p>
                <p>Captain and Crew: {captainAndCrew}</p>
                <p>Cancellation Policy: {cancellationPolicy}</p>
            </div>
        </div>
    );
};

export default BoatCard;
