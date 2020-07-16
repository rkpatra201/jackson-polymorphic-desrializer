package com.java.model;

public class CarPolicyData implements PolicyData{

   private String carName;

    public CarPolicyData() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "CarPolicyData{" +
                "carName='" + carName + '\'' +
                '}';
    }
}
