package com.company;

public class Car {
    private int gear_box;
    private int speed;
    private int electric_current;

    public Car(int g, int s, int e){
        gear_box = g;
        speed = s;
        electric_current = e;
    }
    public void getResultCar(){
        System.out.println("Gear_box: " + gear_box);
        System.out.println("Speed: " + speed);
        System.out.println("Electric current: " + electric_current);
        //int result = gear_box + speed + electric_current;
        //return result;
    }

}