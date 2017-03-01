package com.company;

public class TestCar {

    public static void main(String[] args) {
        Car car1 = new Car();
        int result = car1.getResultCar();
        System.out.println("Result car: " + result);
        System.out.println("--- Inheritance ---");
        MyCar auto = new MyCar();
        auto.getResultCar();
        auto.MyAuto();
        System.out.println("--- Polymorphism ---");
        Car car = new MyCar();
        System.out.println("Created my car: " + car.getResultCar());
        car = new Car();
        System.out.println("Created base car: " + car.getResultCar());
    }
}
