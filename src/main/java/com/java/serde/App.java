package com.java.serde;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.model.PolicyInfo;

import java.io.InputStream;

public class App {
    public static void main(String[] args) throws Exception{

        InputStream carStream = App.class.getClassLoader().getResourceAsStream("policy_health.json");
        ObjectMapper mapper = new ObjectMapper();

        PolicyInfo policyInfo = mapper.readValue(carStream,PolicyInfo.class);

        System.out.println(policyInfo);

    }
}
