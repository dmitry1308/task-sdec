package ru.schepin.sdec.model;


import java.util.Date;

public class Order {
    private String number;
    private Date Date;


    public Order() {
    }

    public Order(String number, java.util.Date date) {
        this.number = number;
        Date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", Date=" + Date +
                '}';
    }
}
