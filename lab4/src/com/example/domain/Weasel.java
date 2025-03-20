package com.example.domain;

public class Weasel extends Animal implements Pet {
    String name;

    public Weasel(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " очень милая");
    }
}
