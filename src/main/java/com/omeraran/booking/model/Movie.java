package com.omeraran.booking.model;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String name;
    private String imageUrl;
    @OneToMany(mappedBy = "movie", cascade = CascadeType.MERGE)
    private Set<Booking> booking;

    public Movie(Long id, String name, String imageUrl, Set<Booking> booking) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.booking = booking;
    }

    public Movie() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Set<Booking> getBooking() {
        return booking;
    }

    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }
}
