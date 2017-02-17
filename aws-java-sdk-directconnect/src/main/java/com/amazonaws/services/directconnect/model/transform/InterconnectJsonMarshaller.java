/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.directconnect.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directconnect.model.*;

import com.amazonaws.protocol.json.*;

/**
 * InterconnectMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InterconnectJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Interconnect interconnect, StructuredJsonGenerator jsonGenerator) {

        if (interconnect == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (interconnect.getInterconnectId() != null) {
                jsonGenerator.writeFieldName("interconnectId").writeValue(interconnect.getInterconnectId());
            }
            if (interconnect.getInterconnectName() != null) {
                jsonGenerator.writeFieldName("interconnectName").writeValue(interconnect.getInterconnectName());
            }
            if (interconnect.getInterconnectState() != null) {
                jsonGenerator.writeFieldName("interconnectState").writeValue(interconnect.getInterconnectState());
            }
            if (interconnect.getRegion() != null) {
                jsonGenerator.writeFieldName("region").writeValue(interconnect.getRegion());
            }
            if (interconnect.getLocation() != null) {
                jsonGenerator.writeFieldName("location").writeValue(interconnect.getLocation());
            }
            if (interconnect.getBandwidth() != null) {
                jsonGenerator.writeFieldName("bandwidth").writeValue(interconnect.getBandwidth());
            }
            if (interconnect.getLoaIssueTime() != null) {
                jsonGenerator.writeFieldName("loaIssueTime").writeValue(interconnect.getLoaIssueTime());
            }
            if (interconnect.getLagId() != null) {
                jsonGenerator.writeFieldName("lagId").writeValue(interconnect.getLagId());
            }
            if (interconnect.getAwsDevice() != null) {
                jsonGenerator.writeFieldName("awsDevice").writeValue(interconnect.getAwsDevice());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static InterconnectJsonMarshaller instance;

    public static InterconnectJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InterconnectJsonMarshaller();
        return instance;
    }

}
