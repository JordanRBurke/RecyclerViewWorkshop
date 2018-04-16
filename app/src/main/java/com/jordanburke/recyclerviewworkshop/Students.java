package com.jordanburke.recyclerviewworkshop;



public class Students {

    private String name;
    private int age;
    private String phoneNumber;
    private String summary;

    public Students(String name, int age, String phoneNumber, String summary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.summary = summary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
