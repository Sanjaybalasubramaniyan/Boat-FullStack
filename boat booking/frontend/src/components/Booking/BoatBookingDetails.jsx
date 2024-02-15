import React from "react";
import { Link } from "react-router-dom";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faBed, faSink, faVectorSquare, faHeart, faShare, faShoppingCart } from '@fortawesome/free-solid-svg-icons';
import Navbar from "../Nabar";

const BoatDetails = () => {
    return(
        <>
            <div style={{textAlign: 'center', marginBottom: '20px'}}>
                <Navbar/>
            </div>
            <br/>
            <br/>
            <div style={{textAlign: 'center', marginBottom: '30px'}}>
                <h1 style={{fontSize: '24px', fontWeight: 'bold'}}>Boat Details</h1>
            </div>
            <br/>
            <br/>
            <div style={{display: 'flex', justifyContent: 'center', alignItems: 'center', flexWrap: 'wrap'}}>
                <Link to="/mba" style={{textDecoration: 'none'}}>
                    <div style={{margin: '20px', width: '400px', height: '600px', backgroundColor: '#f8f8f8', border: '1px solid #ccc', borderRadius: '4px', overflow: 'hidden', boxShadow: '0 2px 4px rgba(0, 0, 0, 0.1)'}}>
                        <section style={{position: 'relative'}}>
                            <figure style={{margin: '0'}}>
                                <div className="img-overlay hot-home">
              
                                    <img src="https://dynamic-media-cdn.tripadvisor.com/media/photo-o/2a/e6/45/bd/caption.jpg?w=500&h=400&s=1" alt="Boat" style={{width: '100%', height: '100%'}} />
                                    <div className="overlay" style={{position: 'absolute', top: '0', left: '0', right: '0', bottom: '0', backgroundColor: 'rgba(0, 0, 0, 0.6)', display: 'flex', justifyContent: 'center', alignItems: 'center', opacity: '0', transition: 'opacity 0.3s ease'}}>
                                        <a href="#" style={{color: '#fff', fontSize: '16px', textDecoration: 'none', padding: '8px 12px', border: '2px solid #fff', borderRadius: '4px'}}>View Boat</a>
                                    </div>
                                    <div className="cont" style={{position: 'absolute', zindex: '6', width: '100%', height: '100%'}}>
                                        <div className="icons-img" style={{position: 'relative', width: '100%', height: '100%'}}>
                                            <button style={{position: 'absolute', border: 'none', backgroundColor: 'transparent', color: 'white', cursor: 'pointer', top: '-40px', zIndex: '10', right: '55px'}}><FontAwesomeIcon icon={faHeart} /></button>
                                            <button style={{position: 'absolute', border: 'none', backgroundColor: 'transparent', color: 'white', cursor: 'pointer', top: '-40px', zIndex: '10', right: '20px'}}><FontAwesomeIcon icon={faShare} /></button>
                                        </div>
                                    </div>
                                </div>
                                <figcaption style={{padding: '10px', fontSize: '18px', textAlign: 'center', backgroundColor: '#fff'}}>Boat in Bangalore</figcaption>
                            </figure>
                            <div className="card-content" style={{padding: '10px'}}>
                                <p>Enchanting boat with spacious cabins...</p>
                                <p>Located at XYZ Boatyard, Bangalore</p>
                                <section className="icons-home" style={{display: 'flex', justifyContent: 'space-between', alignItems: 'center'}}>
                                    <div className="name-icon" style={{display: 'flex', alignItems: 'center'}}>
                                        <span style={{textTransform: 'capitalize'}}></span>
                                        <div className="icon" style={{display: 'flex', alignItems: 'center'}}>
                                            
                                            <span></span>
                                        </div>
                                    </div>
                                    <div className="name-icon" style={{display: 'flex', alignItems: 'center'}}>
                                        <span style={{textTransform: 'capitalize'}}></span>
                                        <div className="icon" style={{display: 'flex', alignItems: 'center'}}>
                                            
                                            <span></span>
                                        </div>
                                    </div>
                                    <div className="name-icon" style={{display: 'flex', alignItems: 'center'}}>
                                        <span style={{textTransform: 'capitalize'}}></span>
                                        <div className="icon" style={{display: 'flex', alignItems: 'center'}}>
                                            
                                            <span>4300</span>
                                        </div>
                                    </div>
                                </section>
                                <section className="price" style={{display: 'flex', justifyContent: 'space-between', alignItems: 'center', marginTop: '10px'}}>
                                    <span style={{textTransform: 'capitalize'}}>For Sale</span>
                                    <span style={{fontWeight: 'bold'}}>$540,000</span>
                                    <Link to="/buy-boat" style={{textDecoration: 'none'}}>
                                        <button style={{display: 'flex', alignItems: 'center', backgroundColor: '#2fa89e', color: 'white', border: 'none', cursor: 'pointer', padding: '5px 10px', borderRadius: '5px'}}><FontAwesomeIcon icon={faShoppingCart} /> Book</button>
                                    </Link>
                                </section>
                            </div>
                        </section>
                    </div>
                </Link>
            </div>
            <div style={{textAlign: 'center', marginBottom: '30px'}}>
                <h2 style={{fontSize: '20px'}}>Owner Details</h2>
                <p style={{fontSize: '16px'}}>Owned by John Doe</p>
                <p style={{fontSize: '16px'}}>Contact: johndoe@example.com</p>
            </div>
        </>
    )
}

export default BoatDetails;
