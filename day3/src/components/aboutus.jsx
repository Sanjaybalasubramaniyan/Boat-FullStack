// AboutUs.js
import React from 'react';
// import styles from './aboutUs.module.css'; 
import Navbar from './Nabar';

function AboutUs() {
    return (
        <div >
            <header>
                <Navbar/>
            </header>
            <main >
                <section >
                    <div >
                        <h2>About Us</h2>
                        <p>Welcome to Boat House - your gateway to extraordinary boat adventures!</p>
                    </div>
                </section>
                <section >
                    <div >
                        <div >
                            <div >
                                <h1>Our Story</h1>
                                <p>Boat House was founded with a passion for providing unique and unforgettable boat experiences. Our goal is to make every journey on the water a special and memorable one.</p>
                                <p>Whether you're looking for a peaceful boat rental, an exciting guided tour, a thrilling fishing excursion, or a venue for hosting a special event, Boat House has you covered.</p>
                            </div>
                            <div >
                                <img
                                    src="https://example.com/about-us-image.jpg" // Update with your actual image path
                                    alt="Boat Adventure"
                                    
                                />
                            </div>
                        </div>
                    </div>
                </section>
                {/* Add more sections as needed */}
            </main>
            <footer className={styles.footer}>
                <div className={styles.container}>
                    <p>&copy; 2024 Boat House. All rights reserved.</p>
                    {/* Add additional footer content */}
                </div>
            </footer>
        </div>
    );
}

export default AboutUs;
