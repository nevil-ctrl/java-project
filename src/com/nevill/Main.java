    package com.nevill;

    import java.util.Random;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scan = new Scanner(System.in);

            Car bmw = new Car(260.53f,
                    1500,
                    "Black",
                    new byte[]{0, 1, 2});
            Truck truck = new Truck(120.53f,
                    new byte[]{0, 1, 2}, false);

            truck.setLoaded(true);
            truck.getLoaded();
        }


    }