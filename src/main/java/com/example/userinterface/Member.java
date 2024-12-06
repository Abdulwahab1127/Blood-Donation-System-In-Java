//MemberClass
package com.example.userinterface;

import java.io.*;


public class Member implements Serializable {
        private String Email;
        private String UserName;
        private String Pass;
        private String Name;
        private long Cnic;
        private long phoneNum;
        private Address address;
        private String area;
        private Blood blood;

        public Member(String email, String userName, String pass, String name, long cnic, long phoneNum,Address address,Blood blood, String area) {
            Email = email;
            UserName = userName;
            Pass = pass;
            Name = name;
            Cnic = cnic;
            this.phoneNum = phoneNum;
            this.address = address;
            this.blood = blood;
            this.area = area;
        }

    @Override
    public String toString() {
        return "Member{" +
                "Email='" + Email + '\'' +
                ", Name='" + Name + '\'' +
                ", phoneNum=" + phoneNum +
                ", address=" + address +
                ", blood=" + blood +
                '}';
    }

    public String getEmail() {
            return Email;
        }

        public String getUserName() {
            return UserName;
        }

        public String getPass() {
            return Pass;
        }

        public String getName() {
            return Name;
        }

        public long getCnic() {
            return Cnic;
        }

        public long getPhoneNum() {
            return phoneNum;
        }

    public String getBlood() {
        return blood.getDonoType();
    }

    public void setBlood(Blood blood) {
        this.blood = blood;
    }

    public String getAddress() {
        return address.getArea();
    }

    public String getArea(){
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


}



