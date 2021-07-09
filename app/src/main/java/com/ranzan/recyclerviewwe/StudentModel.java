package com.ranzan.recyclerviewwe;

public class StudentModel {
    private String name;
    private int age;
    private String address;
    private String dob;
    private int imageID;

    protected StudentModel(String name, int age, String address, String DOB, int imageID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.dob = DOB;
        this.imageID = imageID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDOB() {
        return dob;
    }

    public int getImageID() {
        return imageID;
    }
}
