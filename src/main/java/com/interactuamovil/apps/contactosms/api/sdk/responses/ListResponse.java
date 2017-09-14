package com.interactuamovil.contactosms.api.responses;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListResponse<T> {

    private boolean hasError;
    private String errorMessage;
    private List<T> result;

    public boolean getHasError() {
        return hasError;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public List<T> getResult() {
        return result;
    }

    public void setHasError(boolean b) {
        hasError = b;
    }

    public void setErrorMessage(String s) {
        errorMessage = s;
    }

    public void setResult(List<T> l) {
        result = l;
    }
}
