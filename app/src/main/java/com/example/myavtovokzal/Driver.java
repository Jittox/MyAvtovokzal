package com.example.myavtovokzal;

public class Driver {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String phoneNumber;
    private String busNumber;

    public Driver(String lastName, String firstName, String patronymic, String phoneNumber, String busNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.busNumber = busNumber;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + "\nФамилия: " + lastName + "\nОтчество: " + patronymic
                + "\nНомер телефона: " + phoneNumber + "\nНомер автобуса: " + busNumber+" " +"\n";
    }
}
