package org.spring.cardealersapp.web;

import java.util.Objects;

public class RequestEntity {
    private String username;
    private String password;


    public RequestEntity() {
    }

    public RequestEntity(String username, String password) {
        this.username = username;
        this.password = password;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof RequestEntity)) {
            return false;
        }
        RequestEntity request = (RequestEntity) o;
        return Objects.equals(username, request.username) && Objects.equals(password, request.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            "}";
    }

}