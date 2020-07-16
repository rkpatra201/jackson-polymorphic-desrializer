package com.java.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.java.serde.PolicyInfoDeserializer;

@JsonDeserialize(using = PolicyInfoDeserializer.class)
public class PolicyInfo {

    private  PolicyData data;
    private PolicyType type;

    public PolicyInfo() {
    }

    public PolicyData getData() {
        return data;
    }

    public void setData(PolicyData data) {
        this.data = data;
    }

    public PolicyType getType() {
        return type;
    }

    public void setType(PolicyType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PolicyInfo{" +
                "policyData=" + data +
                ", policyType=" + type +
                '}';
    }
}
