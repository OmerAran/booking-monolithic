import Footer from "./layout/Footer";
import '../App.css'
import '../Home.css'
import Navbar from "./layout/Navbar";
import movieService from "../service/MovieService";
import {useEffect, useState} from "react";

function Home() {
    const [movies, setMovies] = useState([]);

    useEffect(() => {
        getAllMovies();
    }, []);

   const getAllMovies = () => {
     return movieService.getAll()
         .then(response => {
             setMovies(response.data);
             console.log(response.data);
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
                    <h1 className="py-5">Movies</h1>
                        <div>
                            {movies.map(movie =>  (
                                <a key={movie.id} href={'/movie/' + movie.id}>
                                    <img src={movie.imageUrl} alt="Cinema" className="movie-image" />
                                </a>

                                ))}
                        </div>

                </main>
            </div>
            <br/>
            <br/>
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
export default Home;