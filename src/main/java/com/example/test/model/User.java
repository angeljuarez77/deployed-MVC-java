package com.example.test.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;


    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "free")
    private String free;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "st")
    private String st;

    @Column(name = "zip")
    private String zip;

    @Column(name = "photo")
    private String photo;

    @Column(name = "rate")
    private long rate;

    public User() {
        super();


    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFree() {
        return free;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getSt() {
        return st;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoto() {
        return photo;
    }

    public long getRate() {
        return rate;
    }

}
