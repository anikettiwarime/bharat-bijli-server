package com.finzly.bbc.dto.payment;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreditCardDTO {
    private String accountId;
    private String pin;
    private Long limit;
    private String cvv;
    private LocalDate expiryTime;
}

