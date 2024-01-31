// import React from 'react';
// import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
// import Login from './assets/components/Login';
// import Signup from './assets/components/Signup';




// import {RouterProvider, createBrowserRouter} from 'react-router-dom';
// import Home from './assets/components/home';
// import BoatDetails from './assets/components/Booking/BoatBookingDetails';
// function App() {
//   const router= createBrowserRouter([
//     {
//       path: '/',
//       element: <Login/>
//     },
//     {
//       path:'/signup',
//       element:<Signup/>
//     },
//     {
//         path:'/home',
//         element:<Home/>
//       }
//       ,
//     // {
//     //     path:'/add-booking',
//     //     element:<AddBoo/>
//     //   }
//   ])
//   return (
//     <RouterProvider router={router}>
//     </RouterProvider>
    
//   )
// }
// export default App
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Login from './components/Login.jsx';
import Signup from './components/Signup.jsx';
import Home from './components/home.jsx';
import AddBooking from './components/Booking/AddBooking.jsx';
import ViewBooking from './components/ViewBooking.jsx';
import MakePayment from './components/MakePayment.jsx';
import Adminlogin from './components/Admin/Adminlogin.jsx';
import AdminNavbar from './components/Admin/AdminNavbar.jsx';
import Property from './components/Booking/AddBooking.jsx';
import BoatBookingDetails from './components/Booking/BoatBookingDetails.jsx';
import AboutUs from './components/aboutus.jsx';
import Dashboard from './components/dashboard.jsx';




const App = () => {
    return (
        <Router>
            <Routes>
                <Route path="/" element={<Login />} />
                <Route path="/signup" element={<Signup />} />
                <Route path="/home" element={<Home/>} />
                <Route path="/add-booking" element={<AddBooking/>} />
                <Route path="/view-booking" element={<ViewBooking/>} />
                <Route path="/make-payment" element={<MakePayment/>} />
                <Route path="/Admin" element={<Adminlogin/>} />
                <Route path="/homes" element={<AdminNavbar/>} />
                <Route path="/register" element={<Signup/>} />
                <Route path="/login" element={<Login/>} />
                <Route path="/Booking" element={<AddBooking/>} />
                <Route path="/mba" element={<BoatBookingDetails/>} />
                <Route path="/dashboard" element={<Dashboard/>} />
                
            
            
            </Routes>
        </Router>
    );
};

export default App;
