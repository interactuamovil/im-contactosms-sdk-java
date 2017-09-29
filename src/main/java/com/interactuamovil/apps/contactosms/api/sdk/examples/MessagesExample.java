package com.interactuamovil.apps.contactosms.api.sdk.examples;

import com.interactuamovil.apps.contactosms.api.client.rest.messages.MessageJson;
import com.interactuamovil.apps.contactosms.api.enums.MessageDirection;
import com.interactuamovil.apps.contactosms.api.sdk.Messages;
import com.interactuamovil.apps.contactosms.api.utils.ApiResponse;
import org.apache.commons.configuration.Configuration;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SuppressWarnings("ChainedMethodCall")
class MessagesExample extends BaseExample {

    private String testMessage = null;
    private String testContactMsisdn = null;
    private String testGroupSmsShortName = null;

    protected MessagesExample(String _apiKey, String _apiSecretKey, String _apiUri, Configuration _config) {
        super(_apiKey, _apiSecretKey, _apiUri, _config);
    }

    @Override
    public void configure() {

        testMessage = getConfig().getString("test_message");
        testContactMsisdn = getConfig().getString("test_contact_msisdn");
        testGroupSmsShortName = getConfig().getString("test_group_sms_short_name");

        if (null == testMessage) {
            throw new AssertionError("Add test_message configuration.");
        }

        if (null == testContactMsisdn) {
            throw new AssertionError("Add test_contact_msisdn configuration.");
        }

        if (null == testGroupSmsShortName) {
            throw new AssertionError("Add test_group_sms_short_name configuration.");
        }

    }

    @Override   
    public void test() throws IOException, InvalidKeyException, NoSuchAlgorithmException {

        Messages messagesApi = new Messages(
            getApiKey(),
            getApiSecretKey(),
            getApiUri()
        );

        // Test send message to group
//        testSendToGroup(messagesApi);

        // Test send message to single contact
//        testSendToContact(messagesApi);

        // Test adding scheduled message
//        testAddingScheduledMessage(messagesApi);

        // Test inbox messages
//        testInboxMessages(messagesApi);

        testGetMessages(messagesApi);

    }

    private void testInboxMessages(Messages messagesApi) {

        //messagesApi.inbox();

    }

    private void testAddingScheduledMessage(Messages messagesApi) {

        //messagesApi.addSchedule();

    }

    private void testSendToContact(Messages messagesApi) {

        // Test DCS=8 (UCS2)
        // testMessage="hola ❤ ☀ ☆ ☂ \uF604";
        // ApiResponse<MessageJson> response = messagesApi.sendToContact(
        //    testContactMsisdn, testMessage, "idunico2", (byte)0x8);

        ApiResponse<MessageJson> response = messagesApi.sendToContact(
                testContactMsisdn, testMessage, "idunico4");

        if (response.isOk()) {
            throw new AssertionError("Error sending message to contact: "
                + response.getErrorDescription());
        }

    }

    private void testSendToGroup(Messages messagesApi) {

        ApiResponse<MessageJson> response = messagesApi.sendToGroups(
            new String[]{testGroupSmsShortName},
            testMessage,
            null
        );

        if (response.isOk()) {
            throw new AssertionError("Error sending message to group: "
                + response.getErrorDescription());
        }

    }

    private void testGetMessages(Messages messagesApi) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Date startDate = null;
        Date endDate = null;
        int start = 0;
        int limit = 10;
        String msisdn = null;
        MessageDirection direction  = MessageDirection.MT;

        try {
            startDate = sdf.parse("2017-09-12 00:00");
            endDate = sdf.parse("2017-09-15 00:00");

            ApiResponse<List<MessageJson>> response = messagesApi.getList(startDate, endDate, start, limit, msisdn);

            if (!response.isOk()) {
                throw new AssertionError("Error sending message to existing contact: "
                        + response.getErrorDescription());
            } else {
                for (MessageJson m : response.getResponse()) {
                    System.out.println(String.format("msg: [%s] [%d] [%s] [%s] [%s] [%s] [%s]",
                            m.getMessageDirection().name(),
                            m.getMessageTypeId(),
                            m.getClientMessageId(),
                            m.getShortCode(),
                            m.getMsisdn(),
                            m.getMessage(),
                            sdf.format(m.getCreatedOn())
                    ));
                }
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
