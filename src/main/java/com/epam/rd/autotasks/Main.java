package com.epam.rd.autotasks;

public class Main {
    public static void main(String[] args) {
        DecrementingCarousel carousel = new DecrementingCarousel(10);
        System.out.println(carousel.run() == null); //false
        System.out.println(carousel.run() == null); //true
    }
}
