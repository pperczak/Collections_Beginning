package com.example;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("SilverScreen", 10,12);
        //theatre.getSeats();

        if (theatre.reserveSeat("C03")) {
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry, seat is taken");
        }


        if (theatre.reserveSeat("C03")) {
            System.out.println("Please pay");
        }else {
            System.out.println("Sorry, seat is taken");
        }

    }
}
