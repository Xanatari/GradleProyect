package com.gradel.rest.service.gradlerestservice.dtos.Request.Generics;

import lombok.*;

@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class GenericRequest {
    private String customerId;
    private String customerName;
    private String customerLastName;
    private String customerPhoneNumber;
    private String customerEmail;
    private Object genericData;
}
