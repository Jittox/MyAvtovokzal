package com.example.myavtovokzal;

public class Route {
    private String routeName;
    private String routeType;
    private int numberOfStops;
    private Bus bus;

    public Route(String routeName, String routeType, int numberOfStops, Bus bus) {
        this.routeName = routeName;
        this.routeType = routeType;
        this.numberOfStops = numberOfStops;
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Маршрут: " + routeName + "\nТип: " + routeType + "\nКоличество остановок: " + numberOfStops
                + "\nДанные автобуса: " + bus.toString();
    }
}
