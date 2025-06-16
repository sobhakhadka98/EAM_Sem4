package com.va.week7;

public class Student {

    private int studentId;
    private String fName;
    private String lName;
    private String phone;
    private String dob;
    private int addressNo;
    private String city;
    private String street;

    public Student() {
    }

    public Student(int studentId, String fName, String lName, String phone, String dob,
                   int addressNo, String city, String street) {
        this.studentId = studentId;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.dob = dob;
        this.addressNo = addressNo;
        this.city = city;
        this.street = street;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String firstName) {
        this.fName = firstName;
    }

    public String getLName() {
        return lName;
    }

    public void setLName(String lastName) {
        this.lName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(int addressNo) {
        this.addressNo = addressNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
                ", firstName=" + fName +
                ", lastName=" + lName +
                ", phone=" + phone +
                ", dob=" + dob +
                ", addressNo=" + addressNo +
                ", city=" + city +
                ", street=" + street + "]";
    }
}
