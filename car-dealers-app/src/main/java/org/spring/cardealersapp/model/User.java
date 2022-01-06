package org.spring.cardealersapp.model;

import java.util.Objects;

public class User {
    
    private int id;

    private String fullName;

    private String phone;

    private String email;

    private String zipCode;

    private String username;

    private String password;


    public User() {
    }

    public User(int id, String fullName, String phone, String email, String zipCode, String username, String password) {
        this.id = id;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
        this.zipCode = zipCode;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User id(int id) {
        setId(id);
        return this;
    }

    public User fullName(String fullName) {
        setFullName(fullName);
        return this;
    }

    public User phone(String phone) {
        setPhone(phone);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User zipCode(String zipCode) {
        setZipCode(zipCode);
        return this;
    }

    public User username(String username) {
        setUsername(username);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id && Objects.equals(fullName, user.fullName) && Objects.equals(phone, user.phone) && Objects.equals(email, user.email) && Objects.equals(zipCode, user.zipCode) && Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, phone, email, zipCode, username, password);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fullName='" + getFullName() + "'" +
            ", phone='" + getPhone() + "'" +
            ", email='" + getEmail() + "'" +
            ", zipCode='" + getZipCode() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }

}