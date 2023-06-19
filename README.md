# Movie Booking System



<img src ="https://img.shields.io/github/repo-size/OmerAran/booking?color=succeess&label=Size"> <img src="https://img.shields.io/github/directory-file-count/OmerAran/booking/src?color=yellow&label=%20Backend%20Modules"> <img src="https://img.shields.io/github/directory-file-count/OmerAran/booking/booking-react?color=orange&label=%20Frontend%20Modules"> 


<!-- # Frontend

## User App

### Sign Up

![Register](https://github.com/omeraran/booking/blob/main/res/localhost_4200_register.png)

### Sign In

![Login](https://github.com/omeraran/booking/blob/main/res/localhost_4200_login.png)

### Dashboard

![Dashboard](https://github.com/omeraran/booking/blob/main/res/localhost_4200_dashboard.png)
-->
# Backend (Monolith Architecture)

## API

REST API for movie booking system.


## ClientAPI
* `getAllClients()` : get all clients, (task : add pageable for reducing response time.)
* `getAClient(Long id)` : get spesific client with its id.
* `createClient(Client client)` : create a client.
* `updateClients(Client updatedClient)` : If there is `updatedClient.getId` in our db then updates its fields.There is no chance to update passport from here. There will be another service for it.(`PasswordService`)
* `deleteClient(Long id)` : delete by id from db. (task : if user has request to delete its account then make it deactive after 30 days delete permanently.)


## MovieAPI
* `getAllMovies()` : get all movies, (task : add pageable for reducing response time.)
* `getAMovie(Long id)` : get spesific movie with its id.
* `createMovie(Movie movie)` : create a movie.
* `updateMovies(Movie updatedMovie)` : If there is `updatedMovie.getId` in our db then updates its fields.
*  `deleteMovie(Long id)` : delete by id from db.


## BookingAPI
* `getAllBookings()` : get all books, (task : add pageable for reducing response time.)
* `getABooking(Long id)` : get spesific book with its id.
* `createBook(Book book)` : create a book.
* `updateBooks(Book updatedBook)` : If there is `updatedBook.getId` in our db then updates its fields.
*  `deleteBook(Long id)` : delete by id from db.



# Database  - PostgreSQL

## ER Diagram

![ER-Diagram](https://github.com/omeraran/booking/blob/main/res/ER.jpeg)

## Client
- id: long, primary key
- username: varchar
- firstname: varchar
- lastname: varchar
- email: varchar
- dateOfBirth: Date
- password: varchar
- bookings: Booking[]

## Booking
- id: integer, primary key
- client: ClientDto
- movie: MovieDto

## Movie
- id: integer, primary key
- name: integer, foreign key to User.id
- imageUrl: varchar
- booking: Booking[]
