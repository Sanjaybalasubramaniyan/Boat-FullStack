import React from "react";
import { Link } from "react-router-dom";
import Navbar from "../Nabar";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import {
  faBed,
  faSink,
  faVectorSquare,
  faHeart,
  faShare
} from "@fortawesome/free-solid-svg-icons";
import "./Property.css";

const Property = () => {
  return (
    <>
      <div>
        <Navbar />
      </div>
      <br />
      <br />
      <div className="P-h1">
        <h1>“BOOK YOUR BOAT ENJOY A NICE JOURNEY”</h1>
      </div>
      <br />
      <br />
      <div className="containe">
        <Link to="/mba">
          <div className="cards">
            <section className="card">
              <figure>
                <div className="img-overlay hot-home">
                  <img
                    src="https://dynamic-media-cdn.tripadvisor.com/media/photo-o/2a/e6/45/bd/caption.jpg?w=500&h=400&s=1"
                    alt="Boat"
                    style={{ width: "100%", height: "100%" }}
                  />
                  <div className="overlay">
                    <Link to="#">view property</Link>
                  </div>
                  <div className="cont">
                    <div className="icons-img">
                      <button>
                        <FontAwesomeIcon icon={faHeart} />
                      </button>
                      <button>
                        <FontAwesomeIcon icon={faShare} />
                      </button>
                    </div>
                  </div>
                </div>
                <figcaption></figcaption>
              </figure>
              <div>
                <h1 style={{ marginLeft: "100px" }}>SHIKARA BOAT</h1>
              </div>
            </section>
          </div>
        </Link>

        {/* Add other boat sections similarly */}
      </div>
    </>
  );
};

export default Property;
