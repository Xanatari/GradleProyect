package com.gradel.rest.service.gradlerestservice.controller.implementations;

import com.gradel.rest.service.gradlerestservice.controller.contracts.IGenericController;
import com.gradel.rest.service.gradlerestservice.dtos.Request.Generics.GenericRequest;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CustomerContoler implements IGenericController {

    private  static  final Logger LOGGER = LogManager.getLogger(CustomerContoler.class);




    @Override
    public ResponseEntity<Object> registerUser(HttpHeaders httpHeaders, GenericRequest genericRequestCustomer) {
        return null;
    }
}
