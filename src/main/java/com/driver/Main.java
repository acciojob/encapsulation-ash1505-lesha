package com.driver;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        RWOnly first = new RWOnly();
//        first.name="Ash";

        first.setName("Ash");
        first.getName();
    }
}