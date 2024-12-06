//Address Class
package com.example.userinterface;

import java.io.Serializable;

public class Address implements Serializable {
    private String city;
    private String area;
    private int street;

    public Address(int street, String area,String city )
    {
        this.street = street;
        this.city = city;
        this.area = area;

    }

    public void setArea(String area) {
        this.area = area;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setStreet(int street) {
        this.street = street;
    }
    public String getArea() {
        return area;
    }
    public String getCity() {
        return city;
    }
    public int getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", street=" + street +
                '}';
    }
}




