package com.example.myavtovokzal;

public class Bus {
    private Driver driver;
    private String routeNumber;
    private String vehicleNumber;

    public Bus(Driver driver, String routeNumber, String vehicleNumber) {
        this.driver = driver;
        this.routeNumber = routeNumber;
        this.vehicleNumber = vehicleNumber;
    }

    @Override
    public String toString() {
        return "Маршрут: " + routeNumber + "\nАвтобус: " + vehicleNumber + "\nВодитель: " + driver.toString();
    }
}
