package com.example;

public class Person {
    private String name;
    private String lastName;
    private String address;
    private String disaster;
    private int age;
    private int maisonPrice;
    

    public Person(){}
    
    public Person(String name, int age, String lastName, String address, String disaster, int maisonPrice){
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.address = address;
        this.disaster = disaster;
        this.maisonPrice = maisonPrice;
    }

    public String getLastName() {
        return lastName;
    }    

    public String getAddress() {
        return address;
    }

    public String getDisaster() {
        return disaster;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMaisonPrice() {
        return maisonPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }    

    public void setDisaster(String disaster) {
        this.disaster = disaster;
    }

    public void setMaisonPrice(int maisonPrice) {
        this.maisonPrice = maisonPrice;
    }
}