package com.gradel.rest.service.gradlerestservice.controller.contracts;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public interface IGenericController {

    ResponseEntity<Object> registerUser(HttpHeaders httpHeaders);
}
