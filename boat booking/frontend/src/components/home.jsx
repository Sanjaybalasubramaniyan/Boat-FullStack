// Home.js
import React from 'react';
import Navbar from './Nabar';
import styles from './home.module.css'; // Import CSS Modules

function Home() {
    return (
        <div>
            <header>
                <Navbar />
            </header>
            <main>
                <section className={styles.hero}>
                    <div className={styles.container}>
                        <h2>Welcome to Boat House</h2>
                        <p>Your ultimate destination for unforgettable boat trips and experiences</p>
                    </div>
                </section>
                <section className={styles.about}>
                    <div className={styles.container}>
                        <div className={styles.aboutContent}>
                            <div className={styles.text}>
                                <h1>Make Your Trip Nice!</h1>
                                <p><b>Boat House</b> offers unique experiences for every adventurer...</p>
                                <p>Set sail and explore the wonders of the sea with us!</p>
                            </div>
                            <div className={styles.image}>
                                <img
                                    src="https://images.squarespace-cdn.com/content/v1/61e76a17f245727d326f03a9/1645505166554-DWJ14V075J4UBNI1V0UY/600%2BSojourn%2B6.jpg" // Image path
                                    alt="Boat on water"
                                    className={styles.imageZoom} // Apply zoom effect class
                                />
                            </div>
                        </div>
                    </div>
                </section>
                <section className={styles.services}>
                    <div className={styles.container}>
                        <div className={styles.servicesContent}>
                            <h1>Our Services</h1>
                            <div className={styles.servicesList}>
                                <div className={styles.serviceItem}>
                                    <img src="/images/rental-icon.png" alt="Boat Rental" />
                                    <h3>Boat Rentals</h3>
                                    <p>Rent a boat and explore the open sea at your own pace</p>
                                </div>
                                <div className={styles.serviceItem}>
                                    <img src="/images/tour-icon.png" alt="Guided Tours" />
                                    <h3>Guided Tours</h3>
                                    <p>Join one of our expert guides on an unforgettable journey</p>
                                </div>
                                <div className={styles.serviceItem}>
                                    <img src="/images/fishing-icon.png" alt="Fishing Excursions" />
                                    <h3>Fishing Excursions</h3>
                                    <p>Embark on a thrilling fishing adventure with our experienced crew</p>
                                </div>
                                <div className={styles.serviceItem}>
                                    <img src="/images/events-icon.png" alt="Special Events Hosting" />
                                    <h3>Special Events Hosting</h3>
                                    <p>Host your special event aboard our luxurious boats</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
                <section className={styles.contact}>
                    <div className={styles.container}>
                        <div className={styles.contactContent}>
                            <h1>Contact Us</h1>
                            <p>Ready to set sail? Contact us today to book your adventure!</p>
                            <div className={styles.contactDetails}>
                                <p>Email: info@boathouse.com</p>
                                <p>Phone: +1 123-456-7890</p>
                            </div>
                        </div>
                    </div>
                </section>
            </main>
            <footer></footer>
        </div>
    );
}

export default Home;
