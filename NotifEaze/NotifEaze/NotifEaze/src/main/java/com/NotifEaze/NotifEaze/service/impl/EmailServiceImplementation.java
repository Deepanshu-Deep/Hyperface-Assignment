package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;
import com.NotifEaze.NotifEaze.mock.GupshupMock;
import com.NotifEaze.NotifEaze.mock.KayleraMock;
import com.NotifEaze.NotifEaze.service.EmailService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class EmailServiceImplementation implements EmailService {

    @Value("${vendor.name}")
    private String vendor;

    @Autowired
    private GupshupMock gupshupMock;

    @Autowired
    private KayleraMock kayleraMock;





    @Override
    public BaseEmailResponse sendEmail(String to, String subject, String body) {

            if ("Gupshup".equalsIgnoreCase(vendor)) {

                Map<String,String> response = gupshupMock.getEmailMockedResponses();

                System.out.println(response);



                boolean success = response.containsKey("\"status\":\"success\"");
                String message = response.get("message");

                System.out.println(success);
                System.out.println(message);

                return new BaseEmailResponse(success,message);
            } else {

                Map<String,String>  response;
                response = kayleraMock.getEmailMockedResponses();
                boolean success =response.containsKey("\"status\":\"success\"");
                String message = response.get("message");
                return new BaseEmailResponse(success,message);

            }




        }





}
