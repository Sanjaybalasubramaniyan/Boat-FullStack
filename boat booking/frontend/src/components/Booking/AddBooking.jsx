import React from "react";
import { Link } from "react-router-dom";
import Navbar from "../Nabar";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import { faBed, faSink, faVectorSquare, faHeart, faShare } from '@fortawesome/free-solid-svg-icons';
import './Property.css';

const Property = () => {
    return(
        <>

        <div>
            <Navbar/>
        </div>
        <br></br>
        <br></br>
        <div className="P-h1"><h1>“BOOK YOUR BOAT  ENJOY A NICE JOURNEY”
</h1></div>
<br></br>
        <br></br>
       
        <div className="containe">
     <Link to="/mba"><div className="cards">
        <section className="card">
          <figure>
            <div className="img-overlay hot-home">
            <img src="https://dynamic-media-cdn.tripadvisor.com/media/photo-o/2a/e6/45/bd/caption.jpg?w=500&h=400&s=1" alt="Boat" style={{width: '100%', height: '100%'}} />
              <div className="overlay"><a href="#">view property</a></div>
              <div className="cont">
                <div className="icons-img">
                  <button><FontAwesomeIcon icon={faHeart} /></button>
                  <button><FontAwesomeIcon icon={faShare} /></button>
                </div>
              </div>
            </div>
            <figcaption></figcaption>
          </figure>
          <div>
           <h1 style={{marginLeft:'100px'}}>SHIKARA BOAT</h1>
          </div>
              
              
              

            </section>
           
           
          


      </di


      <div className="cards">
        <section className="card">
          <figure>
            <div className="img-overlay hot-home">
              <img src="https://marinlivingmagazine.com/wp-content/uploads/2023/09/electric-boat-with-hydrofoil.jpg" alt="Trulli" />
              <div className="overlay"><a href="#">view property</a></div>
              <div className="cont">
                <div className="icons-img">
                  <button><FontAwesomeIcon icon={faHeart} /></button>
                  <button><FontAwesomeIcon icon={faShare} /></button>
                </div>
              </div>
            </div>
            <figcaption></figcaption>
          </figure>
          
             <div>
             <h1 style={{marginLeft:'100px'}}> ELECTRIC BOAT</h1></div> 
              
              

            </section>
           
           
          


      </div>




      
  
  


    

   
      <div className="cards">
        <section className="card">
          <figure>
            <div className="img-overlay hot-home">
              <img src="https://alleppeyhouseboat.in/wp-content/uploads/2019/02/houseboat-Copy.jpg" alt="Trulli" />
              <div className="overlay"><a href="#">view property</a></div>
              <div className="cont">
                <div className="icons-img">
                  <button><FontAwesomeIcon icon={faHeart} /></button>
                  <button><FontAwesomeIcon icon={faShare} /></button>
                </div>
              </div>
            </div>
            <figcaption></figcaption>
          </figure>
          <div>
             <h1 style={{marginLeft:'100px'}}> HOUSE BOAT</h1></div> 
              
              
              
              

            </section>
           
           
          


      </div>
    
      <div className="cards">
        <section className="card">
          <figure>
            <div className="img-overlay hot-home">
              <img src="https://images.boatsgroup.com/images/1/97/49/6669749_20180404134454646_1_XLARGE.jpg" alt="Trulli" />
              <div className="overlay"><a href="#">view property</a></div>
              <div className="cont">
                <div className="icons-img">
                  <button><FontAwesomeIcon icon={faHeart} /></button>
                  <button><FontAwesomeIcon icon={faShare} /></button>
                </div>
              </div>
            </div>
            <figcaption></figcaption>
          </figure>
          
              
          <div>
             <h1 style={{marginLeft:'100px'}}> FISHING BOAT</h1></div> 
              
              

            </section>
           
           
          


      </div>



      <div className="cards">
        <section className="card">
          <figure>
            <div className="img-overlay hot-home">
              <img src="https://www.yachtworld.com/research/files/2023/03/sportfish-1.jpg" alt="Trulli" />
              <div className="overlay"><a href="#">view property</a></div>
              <div className="cont">
                <div className="icons-img">
                  <button><FontAwesomeIcon icon={faHeart} /></button>
                  <button><FontAwesomeIcon icon={faShare} /></button>
                </div>
              </div>
            </div>
            <figcaption></figcaption>
          </figure>
          
              
          <div>
             <h1 style={{marginLeft:'100px'}}> JET SKI BOAT</h1></div> 
              
              

            </section>
           
           
          


      </div>

      <div className="cards">
        <section className="card">
          <figure>
            <div className="img-overlay hot-home">
              <img src="https://keyassets.timeincuk.net/inspirewp/live/wp-content/uploads/sites/18/2023/03/best-wake-surf-boats-yamaha-222XD.jpg" alt="Trulli" />
              <div className="overlay"><a href="#">view property</a></div>
              <div className="cont">
                <div className="icons-img">
                  <button><FontAwesomeIcon icon={faHeart} /></button>
                  <button><FontAwesomeIcon icon={faShare} /></button>
                </div>
              </div>
            </div>
            <figcaption></figcaption>
          </figure>
          
              
          <div>
             <h1 style={{marginLeft:'100px'}}> SURF BOAT</h1></div> 
              
              

            </section>
           
           
          


      


      </div>


      

   


  </div>
        </>
    )
}
export default Property