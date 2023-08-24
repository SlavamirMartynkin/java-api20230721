package VerificationWork2;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
    Elevator elevator1 = new Elevator(5,10);
    Elevator elevator2 = new Elevator(20);

    System.out.println("--------------------------------------");

    elevator1.move(9);
    System.out.println(elevator1);
    elevator2.move(15);
    System.out.println(elevator2);

    System.out.println("--------------------------------------");

    //Elevator elevator3 = new Elevator(10,5);
    //elevator1.move(4);
    }
}
