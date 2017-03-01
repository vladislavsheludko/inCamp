package com.company;

public class Car {
    public int gear_box = 6;
    public int speed = 250;

    public int getResultCar(){
        System.out.println("Gear_box: " + gear_box);
        System.out.println("Speed: " + speed);
        int electric_current = getElectricCurr();
        System.out.println("Electric current: " + electric_current);
        int result = gear_box + speed + electric_current;
        return result;
    }

    private int getElectricCurr(){
        return 8;
    }
}

