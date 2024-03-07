package com.NotifEaze.NotifEaze.service.impl;

import com.NotifEaze.NotifEaze.dto.BaseSmsResponse;
import com.NotifEaze.NotifEaze.dto.SmsDeliveryStatus;
import com.NotifEaze.NotifEaze.service.SmsService;

public class SmsServiceImplementation implements SmsService {
    @Override
    public BaseSmsResponse sendSms(String phoneNumber, String message) {
        return null;
    }

    @Override
    public SmsDeliveryStatus checkDeliveryStatus(String messageId) {
        return null;
    }
}
