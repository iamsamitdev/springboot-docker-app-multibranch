package com.example.demo.model;

public class GreetingRequest {
    private String name;

    public GreetingRequest() {}

    public GreetingRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}