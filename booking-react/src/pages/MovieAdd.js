import Footer from "./layout/Footer";
import Navbar from "./layout/Navbar";
import '../App.css';
import movieService from "../service/MovieService";
import {useState} from "react";
import {Link} from "react-router-dom";

function MovieAdd() {

    const movieClass = {
        name : "",
        imageUrl :""
    };

    const [movie, setMovie] = useState(movieClass);
    const [submitted, setSubmitted] = useState(false);

    const handleInputChange = event => {
        const { name, value } = event.target;
        setMovie({ ...movie, [name]: value });
    };


    const createOne = () => {
        var data = {
            name: movie.name,
            imageUrl: movie.imageUrl
        }
        return movieService.createOne(data)
            .then(response => {
                setMovie({
                      id : response.data.id,
                      name : response.data.name ,
                      imageUrl : response.data.imageUrl
                });
                setSubmitted(true)
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
                    {submitted ? (
                        <div>
                            <h4>You submitted successfully!</h4>
                            <Link to={'/'}>Go back to the movies</Link>
                        </div>
                    ) : (
                        <div>
                            <div className="form-group">
                                <label htmlFor="name">movie name </label>
                                <input
                                    type="text"
                                    className="form-control"
                                    id="name"
                                    required
                                    value={movie.name}
                                    onChange={handleInputChange}
                                    name="name"
                                />
                            </div>

                            <div className="form-group">
                                <label htmlFor="imageUrl">image url </label>
                                <input
                                    type="text"
                                    className="form-control"
                                    id="imageUrl"
                                    required
                                    value={movie.imageUrl}
                                    onChange={handleInputChange}
                                    name="imageUrl"
                                />
                            </div>

                            <button onClick={createOne} className="btn btn-success">
                                Submit
                            </button>
                        </div>
                    )}
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
export default MovieAdd;