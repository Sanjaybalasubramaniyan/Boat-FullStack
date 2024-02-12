package com.boat.jagan.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Boat {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boatId;

    private String boatName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boat_category_id")
    private BoatCategory boatCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // Constructors, getters, and setters

    public Boat() {
    }

    public Boat(String boatName, BoatCategory boatCategory, User user) {
        this.boatName = boatName;
        this.boatCategory = boatCategory;
        this.user = user;
    }

    public Long getBoatId() {
        return boatId;
    }

    public void setBoatId(Long boatId) {
        this.boatId = boatId;
    }

    public String getBoatName() {
        return boatName;
    }

    public void setBoatName(String boatName) {
        this.boatName = boatName;
    }

    public BoatCategory getBoatCategory() {
        return boatCategory;
    }

    public void setBoatCategory(BoatCategory boatCategory) {
        this.boatCategory = boatCategory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
