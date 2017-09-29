package com.interactuamovil.contactosms.api.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActionMessageResponse {

    private String result;

    public void setResult(String s) {
        result = s;
    }

    public String getResult() {
        return result;
    }

}
