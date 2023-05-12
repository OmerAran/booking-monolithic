import './App.css';
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Home from './pages/Home'
import Booking from "./pages/Booking";
import MovieDetail from "./pages/MovieDetail";
import MovieAdd from "./pages/MovieAdd";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route exact path='/' element={<Home />}/>
        <Route exact path='/add' element={<MovieAdd />}/>
        <Route exact path='/booking' element={<Booking />}/>
        <Route path="/movie/:id" element={<MovieDetail/>} />

      </Routes>
    </BrowserRouter>
  );
}

export default App;
