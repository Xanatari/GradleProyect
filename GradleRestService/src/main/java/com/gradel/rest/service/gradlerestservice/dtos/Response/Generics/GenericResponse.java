package com.gradel.rest.service.gradlerestservice.dtos.Response.Generics;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class GenericResponse {

    private String code;
    private String status;
    private Object msg;
    private String exception;

}
