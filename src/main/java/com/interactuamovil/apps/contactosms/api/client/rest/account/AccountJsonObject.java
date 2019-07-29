package com.interactuamovil.apps.contactosms.api.client.rest.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.interactuamovil.apps.contactosms.api.utils.JsonDateTimeDeserializer;
import com.interactuamovil.apps.contactosms.api.utils.JsonDateTimeSerializer;
import com.interactuamovil.apps.contactosms.api.utils.JsonObject;

import java.util.Date;

/**
 * Created by javier on 1/02/16.
 * Account json object response
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountJsonObject extends JsonObject {

    @JsonProperty("account_id")
    private Integer accountId;
    @JsonProperty("account_name")
    private String accountName;
    @JsonProperty("client_name")
    private String clientName;
    @JsonProperty("valid_since")
    private Date validSince;
    @JsonProperty("valid_thru")
    private Date validThru;
    @JsonProperty("sms_short_name")
    private String smsShortName;
    @JsonProperty("account_status")
    private String accountStatus;
    @JsonProperty("account_type")
    private String accountType;
    @JsonProperty("can_sell_extras")
    private Boolean canSellExtras;
    @JsonProperty("subscription_type")
    private String subscriptionType;
    @JsonProperty("default_subaccount_id")
    private Integer defaultSubaccountId;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("created_on")
    private Date createdOn;
    @JsonProperty("subscription_message")
    private String subscriptionMessage;
    @JsonProperty("antispam_enabled")
    private Boolean antispamEnabled;
    @JsonProperty("api_enabled")
    private Boolean apiEnabled;
    @JsonProperty("api_use_short_name")
    private Boolean apiUseShortName;
    @JsonProperty("seller_email")
    private String sellerEmail;
    @JsonProperty("seller_name")
    private String sellerName;
    @JsonProperty("seller_phone_number")
    private String sellerPhoneNumber;
    @JsonProperty("api_callback_email_notification")
    private String apiCallbackEmailNotification;
    @JsonProperty("reporting_emails")
    private String reportingEmails;
    @JsonProperty("current_package")
    private PackageJsonObject currentPackage;



    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @JsonSerialize(using = JsonDateTimeSerializer.class)
    public Date getValidSince() {
        return validSince;
    }

    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
    public void setValidSince(Date validSince) {
        this.validSince = validSince;
    }

    @JsonSerialize(using = JsonDateTimeSerializer.class)
    public Date getValidThru() {
        return validThru;
    }

    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
    public void setValidThru(Date validThru) {
        this.validThru = validThru;
    }

    public String getSmsShortName() {
        return smsShortName;
    }

    public void setSmsShortName(String smsShortName) {
        this.smsShortName = smsShortName;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Boolean getCanSellExtras() {
        return canSellExtras;
    }

    public void setCanSellExtras(Boolean canSellExtras) {
        this.canSellExtras = canSellExtras;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Integer getDefaultSubaccountId() {
        return defaultSubaccountId;
    }

    public void setDefaultSubaccountId(Integer defaultSubaccountId) {
        this.defaultSubaccountId = defaultSubaccountId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonSerialize(using = JsonDateTimeSerializer.class)
    public Date getCreatedOn() {
        return createdOn;
    }

    @JsonDeserialize(using = JsonDateTimeDeserializer.class)
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getSubscriptionMessage() {
        return subscriptionMessage;
    }

    public void setSubscriptionMessage(String subscriptionMessage) {
        this.subscriptionMessage = subscriptionMessage;
    }

    public Boolean getAntispamEnabled() {
        return antispamEnabled;
    }

    public void setAntispamEnabled(Boolean antispamEnabled) {
        this.antispamEnabled = antispamEnabled;
    }

    public Boolean getApiEnabled() {
        return apiEnabled;
    }

    public void setApiEnabled(Boolean apiEnabled) {
        this.apiEnabled = apiEnabled;
    }

    public Boolean getApiUseShortName() {
        return apiUseShortName;
    }

    public void setApiUseShortName(Boolean apiUseShortName) {
        this.apiUseShortName = apiUseShortName;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerPhoneNumber() {
        return sellerPhoneNumber;
    }

    public void setSellerPhoneNumber(String sellerPhoneNumber) {
        this.sellerPhoneNumber = sellerPhoneNumber;
    }

    public String getApiCallbackEmailNotification() {
        return apiCallbackEmailNotification;
    }

    public void setApiCallbackEmailNotification(String apiCallbackEmailNotification) {
        this.apiCallbackEmailNotification = apiCallbackEmailNotification;
    }

    public String getReportingEmails() {
        return reportingEmails;
    }

    public void setReportingEmails(String reportingEmails) {
        this.reportingEmails = reportingEmails;
    }

    public PackageJsonObject getCurrentPackage() {
        return currentPackage;
    }

    public void setCurrentPackage(PackageJsonObject currentPackage) {
        this.currentPackage = currentPackage;
    }
}
