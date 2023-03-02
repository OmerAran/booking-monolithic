import Footer from "./layout/Footer";
import '../App.css'
import '../Home.css'
import Navbar from "./layout/Navbar";
import {useState} from "react";

function Booking() {
    const bookingEntity = {
        id : null,
        client : {
            username : "Ömer Aran"
        },
        movie : {
            name : "The Red Pill"
        }
    };
    const [booking, setBooking] = useState(bookingEntity)



    return (
        <div>
            <Navbar/>
            <div className={'App-header'}>
                <h2>Your Booking Details</h2>
                <table>
                    <thead>
                    <tr>
                        <th>Movie Name</th>
                        <th>Client Username</th>
                    </tr>

                    </thead>
                    <tbody>
                    <tr>
                        <td>{booking.movie.name}</td>
                        <td>{booking.client.username}</td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <Footer />
        </div>
    );
}
export default Booking;