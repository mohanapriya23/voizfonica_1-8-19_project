package com.example.voizfonica;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@RequiredArgsConstructor

public class Plans
{
    @Id
    private String Id;
    private  String currency;
    private  String planName;
    private String valid;
    private  String amount;
    private  String perDay;
    private String data;
    private String sms;

    public Plans(String currency, String planName, String valid, String amount, String perDay, String data, String sms) {
        this.currency = currency;
        this.planName = planName;
        this.valid = valid;
        this.amount = amount;
        this.perDay = perDay;
        this.data = data;
        this.sms = sms;
    }



}

