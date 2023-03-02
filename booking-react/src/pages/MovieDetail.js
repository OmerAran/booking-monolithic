import '../App.css';
import Footer from "./layout/Footer";
import Navbar from "./layout/Navbar";
import movieService from "../service/MovieService";
import {useEffect, useState} from "react";
import {useParams} from "react-router-dom";

function MovieDetail() {

    const movieClass = {
        id: null,
        name:"",
        imageUrl: "",
        movieBookingDto:[
            {
                id:null,
                bookingClientDto:
                    {
                        id: null,
                        firstName: "",
                        lastName: "",
                        username: ""
                    }
            }

        ]
    };

    const {id} = useParams();
    const [movie, setMovie] = useState(movieClass);

    useEffect(() => {
        if (id){
            getOneMovie(id);
        }
    }, [id]);

    const getOneMovie = id => {
      return movieService.getOne(id)
          .then(response => {
              setMovie(response.data);
              console.log(response.data)
          })
          .catch(e => {
              console.log(e);
          })
    }

    return (
        <main>
            <Navbar/>
            <div className={'content'}>
                <main>
                    <h1 className="py-5">{movie.name}</h1>
                    <div>
                        <img className={'movie-image'} src={movie.imageUrl} alt={'omeraran'}/>
                    </div>
                    <h3>Who made booking for this movie</h3>
                    <ul>
                        {movie.movieBookingDto.map(client =>(
                            <li key={client.id}>{client.bookingClientDto.username}</li>
                        ))}
                    </ul>
                </main>
            </div>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <br/>
            <Footer />
        </main>
    );
}
export default MovieDetail;