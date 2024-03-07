package com.NotifEaze.NotifEaze.service;

import com.NotifEaze.NotifEaze.dto.BaseEmailResponse;
import org.json.JSONException;

public interface EmailService {
    BaseEmailResponse sendEmail(String to, String subject, String body) ;
}
