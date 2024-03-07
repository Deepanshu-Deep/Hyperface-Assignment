package com.NotifEaze.NotifEaze.mock;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class KayleraMock {
    private static final Map<String, String> SMS_MOCKED_RESPONSES = new HashMap<>();
    private static final Map<String, String> EMAIL_MOCKED_RESPONSES = new HashMap<>();

    static {


        /*
        <?xml version="1.0" encoding="UTF-8" ?>
            <root>
                <status>00</status>
                <messageId>123456</messageId>
                <responseMessage>Success</responseMessage>
            </root>
        */
        SMS_MOCKED_RESPONSES.put("123456", "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "            <root>\n" +
                "                <status>00</status>\n" +
                "                <messageId>123456</messageId>\n" +
                "                <responseMessage>Success</responseMessage>\n" +
                "            </root>");

        /*
        <?xml version="1.0" encoding="UTF-8" ?>
            <root>
                <status>1</status>
                <messageId>789012</messageId>
                <responseMessage>Failed</responseMessage>
            </root>
         */
        SMS_MOCKED_RESPONSES.put("789012", "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "            <root>\n" +
                "                <status>1</status>\n" +
                "                <messageId>789012</messageId>\n" +
                "                <responseMessage>Failed</responseMessage>\n" +
                "            </root>");


        EMAIL_MOCKED_RESPONSES.put("Email1", "{\"success\":true,\"message\":\"Email sent successfully.\"}");
    }




        public Map<String, String> getSmsMockedResponses() {
            return SMS_MOCKED_RESPONSES;
        }

        public Map<String, String> getEmailMockedResponses() {
            return EMAIL_MOCKED_RESPONSES;
        }



}
