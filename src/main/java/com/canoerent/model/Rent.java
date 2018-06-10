package com.canoerent.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "rent")
public class Rent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentId;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private User user;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Canoe canoe;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Rent rent;

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    private Date startDate;
    private Date endDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Canoe getCanoe() {
        return canoe;
    }

    public void setCanoe(Canoe canoe) {
        this.canoe = canoe;
    }


    public Long getRentId() {
        return rentId;
    }

    public void setRentId(Long rentId) {
        this.rentId = rentId;
    }


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Rent(User user, Canoe canoe, Rent rent, Date startDate, Date endDate) {
        this.user = user;
        this.canoe = canoe;
        this.rent = rent;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Rent(){
    }
}
