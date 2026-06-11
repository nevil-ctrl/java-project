package com.nevill;

public class Transport {

    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        System.out.println("Конструктор включен:");
        setValues(speed, weight, color, coordinate);
        System.out.println("Результаты:\n" + getValues());
    }

    public Transport(float speed, byte[] coordinate) {
        System.out.println("Конструктор2 включен:");
        this.coordinate = coordinate;
        this.speed = speed;
        System.out.println(getValues());
    }


    protected void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.color = color;
        this.weight = weight;
        this.coordinate = coordinate;

    }

    protected String getValues() {
        String info = "Object speed:" + this.speed + ". weight:" + this.weight + ". color:" + this.color + ". \n";
        String infoCoordinate = "Coordinate: \n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + "\n";
        }
        return info + infoCoordinate;
    }

}
