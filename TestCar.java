package com.company;

public class TestCar {

    public static void main(String[] args) {
        Car car1 = new Car(6, 250, 8);
        car1.getResultCar();
        System.out.println("--- Inheritance ---");
        MyCar auto = new MyCar(5,200,5);
        auto.getResultCar();
        auto.MyAuto();
        System.out.println("--- Polymorphism ---");
        Car car = new Car(5, 240, 6);
        car.getResultCar();
        MyCar mycar = new MyCar(5,200,5);
        mycar.getResultCar();
    }
}
