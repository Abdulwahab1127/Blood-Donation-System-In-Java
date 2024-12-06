//Blood Class
package com.example.userinterface;

import java.io.Serializable;

public class Blood implements Serializable {
    private String DonoType = "";
    private int DonoAmount;
    private String RequiredType;
    private int RequiredAmount;
    private String area;
    private String donorName;
    public Blood(){}
    public Blood(String DonoType, int DonoAmount, String donorName, String area)
    {
        this.area = area;
        this.donorName = donorName;
        this.DonoType = DonoType;
        this.DonoAmount = DonoAmount;
    }

    public Blood(int RequiredAmount, String RequiredType)
    {
        this.RequiredAmount = RequiredAmount;
        this.RequiredType =  RequiredType;
    }

    public String getArea() {
        return area;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonoAmount(int donoAmount) {
        DonoAmount = donoAmount;
    }
    public void setRequiredAmount(int requiredAmount) {
        RequiredAmount = requiredAmount;
    }
    public void setDonoType(String donoType) {
        DonoType = donoType;
    }
    public void setRequiredType(String requiredType) {
        RequiredType = requiredType;
    }
    public int getDonoAmount() {
        return DonoAmount;
    }
    public String getDonoType() {
        return DonoType;
    }
    public int getRequiredAmount() {
        return RequiredAmount;
    }
    public String getRequiredType() {
        return RequiredType;
    }

    @Override
    public String toString() {
        return super.toString()+"Blood{" +
                "DonoType='" + DonoType + '\'' +
                ", DonoAmount=" + DonoAmount +
                ", area='" + area + '\'' +
                '}';
    }
}