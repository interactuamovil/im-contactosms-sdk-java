package com.interactuamovil.apps.contactosms.api.client.rest.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.interactuamovil.apps.contactosms.api.utils.JsonObject;

/**
 * Created by javier on 2/11/16.
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageRecipientsJson extends JsonObject {
    @JsonProperty("msisdn")
    private String msisdn;
    @JsonProperty("status")
    private String status;

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
