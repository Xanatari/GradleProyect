package com.gradel.rest.service.gradlerestservice.dtos.Request.Generics;

import lombok.*;
import org.springframework.lang.Nullable;

@Builder
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class GenericRequest {
    private String customerId;
}
