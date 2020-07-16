package com.java.serde;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.java.model.*;

import java.io.IOException;

public class PolicyInfoDeserializer extends StdDeserializer<PolicyInfo> {

    public PolicyInfoDeserializer() {
        super(PolicyInfo.class);
    }

    @Override
    public PolicyInfo deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        PolicyInfo info = new PolicyInfo();
        JsonNode rootNode = jsonParser.getCodec().readTree(jsonParser);
        if (rootNode.has("type")) {
            JsonNode typeNode = rootNode.get("type");
            String typeValue = typeNode.textValue();
            info.setType(PolicyType.valueOf(typeValue));

            JsonNode dataNode = rootNode.get("data");
            ObjectMapper mapper = new ObjectMapper();
            PolicyData policyData = null;
            switch (info.getType())
            {
                case CAR:
                    policyData = mapper.treeToValue(dataNode, CarPolicyData.class);
                    break;
                case HEALTH:
                    policyData = mapper.treeToValue(dataNode, HealthPolicyData.class);
                    break;
            }
            info.setData(policyData);

        }
        return info;
    }
}
