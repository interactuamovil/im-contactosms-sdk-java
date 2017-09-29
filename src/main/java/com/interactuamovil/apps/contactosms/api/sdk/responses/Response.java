package com.interactuamovil.contactosms.api.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

    private boolean error = Boolean.FALSE;
    private String errorMessage = null;
    private T result = null;

    public boolean hasError() {
        return error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public T getResult() {
        return result;
    }

    public void setError(boolean b) {
        error = b;
    }

    public void setErrorMessage(String s) {
        errorMessage = s;
    }

    public void setResult(T o) {
        result = o;
    }

}
