package com.gradel.rest.service.gradlerestservice.dtos.Response.Bussines;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Builder
@Setter
@Getter
public class CustomerInfo {
    private String customerName;
    private String customerLastName;
    private String customerPhoneNumber;
    private String customerEmail;
    private @Nullable Object genericData;
}
