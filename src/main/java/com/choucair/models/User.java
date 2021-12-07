package com.choucair.models;

public class User {

    private String title;
    private String first_name;
    private String last_name;
    private String email;
    private String dominio;
    private String identity;
    private String user;

    public User(String title, String first_name, String last_name, String email, String dominio, String identity, String user) {
        this.title = title;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.dominio = dominio;
        this.identity = identity;
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getDominio(){return dominio;}

    public String getIdentity() {
        return identity;
    }

    public String getUser() {
        return user;
    }
}
