package com.nevill;

public class Truck extends Transport {
    public Truck(float speed, byte[] coordinate) {
        super(speed, coordinate);

    }
    public Truck(float speed, byte[] coordinate,boolean isLoaded) {
        super(speed, coordinate);
        this.isLoaded = isLoaded;

    }

    private boolean isLoaded;

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public void getLoaded() {
        if (isLoaded) {
            System.out.println("Грузовичок загружен");
        } else {
            System.out.println("Грузовичок не загружен");
        }
    }
}
