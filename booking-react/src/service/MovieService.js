import http from "./http-common";

    const getAll = () => {
        return http.get("/movie");
    };

    const getOne = id => {
        return http.get(`/movie/${id}`);
    };

    const createOne = data => {
        return http.post(`/movie`, data);
    };

    const updateOne = data => {
        return http.put(`/movie/${data.id}`, data);
    };

    const deleteOne = id =>{
        return http.delete(`/movie/${id}`);
    };

    const MovieService = {
        getAll,
        getOne,
        createOne,
        updateOne,
        deleteOne
    }

    export default MovieService;