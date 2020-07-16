package com.java;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.model.CarPolicyData;
import com.java.model.HealthPolicyData;
import com.java.model.PolicyInfo;
import com.java.model.PolicyType;

/**
 * Hello world!
 */
public class App {


    public static void main(String[] args) throws Exception {

        ObjectMapper o = new ObjectMapper();
        System.out.println("Hello World!");
        PolicyInfo info = new PolicyInfo();
        CarPolicyData carPolicyData = new CarPolicyData();
        carPolicyData.setCarName("bolero");
        info.setData(carPolicyData);
        info.setType(PolicyType.CAR);

        String result = o.writeValueAsString(info);
        System.out.println(result);

        HealthPolicyData healthPolicyData = new HealthPolicyData();
        healthPolicyData.setPersonName("hari");
        info = new PolicyInfo();
        info.setData(healthPolicyData);
        info.setType(PolicyType.HEALTH);

        result = o.writeValueAsString(info);
        System.out.println(result);

    }
}
