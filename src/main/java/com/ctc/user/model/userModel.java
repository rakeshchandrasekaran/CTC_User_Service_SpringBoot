package com.ctc.user.model;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
@NamedQuery(name = "userModel.findAll", query = "SELECT d FROM userModel d")
public class userModel {
    @Id
    @Column(name = "Id")
    private Integer Id;

    @Column(name = "Email")
    private String email;

    @Column(name = "Username")
    private String userName;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return "XXXXXX";
    }

    public void setPassword(String password) {
        this.password = "XXXXXXXX";
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Password")
    private String password;

    @Column(name = "Role")
    private String role;

    @Column(name = "Name")
    private String name;

}
