package com.jmadruga.models;

public class User {
    private Integer id;
    private String subscription;

    public User(Integer id, String subscription) {
        this.id = id;
        this.subscription = subscription;
    }

    public Integer getId() {
        return id;
    }

    public String getSubscription() {
        return subscription;
    }
}
