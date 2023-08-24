package VerificationWork2;

import java.util.Random;

public class Elevator {
    private int currentFloor;
    public int minFloor;
    public int maxFloor;
    private String elevatorName;
    private static int number = 0;

    public Elevator(int minFloor, int maxFloor) throws IllegalAccessException{
        if (minFloor >= maxFloor){
            throw new IllegalAccessException("Неверный диапазон!");
        }
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = minFloor;
        this.elevatorName = String.format("Лифт №%d", ++Elevator.number);
        System.out.println("Создан " + elevatorName);
        getFloor();
    }
    public Elevator(int maxFloor){
        this.minFloor = 1;
        this.maxFloor = maxFloor;
        this.currentFloor = minFloor;
        this.elevatorName = String.format("Лифт №%d", ++Elevator.number);
        System.out.println("Создан " + elevatorName);
        getFloor();
    }
    public void move(int floor)throws IllegalAccessException{
        if(floor < minFloor || floor > maxFloor){
            throw new IllegalAccessException("Такого этажа нет!");
        }
        this.currentFloor = floor;
        System.out.printf("Сейчас " +  elevatorName + " на %d этаже.%n", currentFloor);
    }
    private int getFloor(){
        System.out.printf("Сейчас " +  elevatorName + " на %d этаже.%n", currentFloor);
        return currentFloor;
    }
    @Override
    public String toString(){
        return String.format("[%d, %d] -> %d", minFloor, maxFloor, currentFloor);
    }

}
