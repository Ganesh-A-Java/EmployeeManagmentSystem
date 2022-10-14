package com.employeemanagmnetsystem.employeemanagmentsystem.POJOCLASS;


public class Address {

    private int addressid;
    private String City;
    private String State;
    private String Country;

    public Address() {
    }

    public Address(String city, String state, String country) {
        City = city;
        State = state;
        Country = country;
    }

    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressid=" + addressid +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
