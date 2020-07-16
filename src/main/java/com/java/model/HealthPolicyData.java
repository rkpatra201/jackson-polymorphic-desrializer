package com.java.model;

public class HealthPolicyData  implements PolicyData{
    String personName;
    String personAge;

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }

    public HealthPolicyData() {
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public String toString() {
        return "HealthPolicyData{" +
                "personName='" + personName + '\'' +
                ", personAge='" + personAge + '\'' +
                '}';
    }
}
