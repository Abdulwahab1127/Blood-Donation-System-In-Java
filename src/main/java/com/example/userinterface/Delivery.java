//DELIVERY CLASS
package com.example.userinterface;

public class Delivery{
    private String reason;
    private Address add;

    public Delivery(Address add)
    {
        this.add = add;
    }

    public Delivery(String reason, Address add)
    {
        this.reason = reason;
        this.add = add;
    }

    public Address getAdd() {
        return add;
    }
    public String getReason() {
        return reason;
    }
    public void setAdd(Address add) {
        this.add = add;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    public void DisplayNewAddress()
    {
        System.out.println("City :" + " " + add.getCity());
        System.out.println("Area :" + " " + add.getArea());
        System.out.println("Street No :" + " " + add.getStreet());
        System.out.println("Your reason :" + " " + reason);
    }

    public void NotUrgent() {
        System.out.println("City :" + " " + add.getCity());
        System.out.println("Area :" + " " + add.getArea());
        System.out.println("Street No :" + " " + add.getStreet());
    }
}
