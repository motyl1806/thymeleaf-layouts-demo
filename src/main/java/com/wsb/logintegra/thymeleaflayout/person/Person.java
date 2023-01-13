package com.wsb.logintegra.thymeleaflayout.person;

import java.util.List;

public class Person {
    public static List<Person> people;
    public Integer id;
    public String username;
    public String email;
    public Boolean enabled;
    public String role;

    public Person(Integer id, String username, String email, Boolean enabled, String role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.enabled = enabled;
        this.role = role;
    }

    public Person() {

    }

    public static Person findById(Integer searchedId) {
        return Person.people.stream()
                .filter(person -> person.id.equals(searchedId))
                .findAny()
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", enabled=" + enabled +
                ", role='" + role + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
