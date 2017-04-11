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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A collection of <a>RequestValidator</a> resources of a given <a>RestApi</a>.
 * </p>
 * <div class="remarks">
 * <p>
 * In Swagger, the <a>RequestValidators</a> of an API is defined by the <a href=
 * "http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validators.html"
 * >x-amazon-apigateway-request-validators</a> extension.
 * </p>
 * </div> <div class="seeAlso"><a
 * href="http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-request-validation.html">Enable
 * Basic Request Validation in API Gateway</a></div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRequestValidatorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String position;
    /**
     * <p>
     * The current page of <a>RequestValidator</a> resources in the <a>RequestValidators</a> collection.
     * </p>
     */
    private java.util.List<RequestValidator> items;

    /**
     * @param position
     */

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return
     */

    public String getPosition() {
        return this.position;
    }

    /**
     * @param position
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRequestValidatorsResult withPosition(String position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The current page of <a>RequestValidator</a> resources in the <a>RequestValidators</a> collection.
     * </p>
     * 
     * @return The current page of <a>RequestValidator</a> resources in the <a>RequestValidators</a> collection.
     */

    public java.util.List<RequestValidator> getItems() {
        return items;
    }

    /**
     * <p>
     * The current page of <a>RequestValidator</a> resources in the <a>RequestValidators</a> collection.
     * </p>
     * 
     * @param items
     *        The current page of <a>RequestValidator</a> resources in the <a>RequestValidators</a> collection.
     */

    public void setItems(java.util.Collection<RequestValidator> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<RequestValidator>(items);
    }

    /**
     * <p>
     * The current page of <a>RequestValidator</a> resources in the <a>RequestValidators</a> collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The current page of <a>RequestValidator</a> resources in the <a>RequestValidators</a> collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRequestValidatorsResult withItems(RequestValidator... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<RequestValidator>(items.length));
        }
        for (RequestValidator ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current page of <a>RequestValidator</a> resources in the <a>RequestValidators</a> collection.
     * </p>
     * 
     * @param items
     *        The current page of <a>RequestValidator</a> resources in the <a>RequestValidators</a> collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRequestValidatorsResult withItems(java.util.Collection<RequestValidator> items) {
        setItems(items);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRequestValidatorsResult == false)
            return false;
        GetRequestValidatorsResult other = (GetRequestValidatorsResult) obj;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public GetRequestValidatorsResult clone() {
        try {
            return (GetRequestValidatorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
