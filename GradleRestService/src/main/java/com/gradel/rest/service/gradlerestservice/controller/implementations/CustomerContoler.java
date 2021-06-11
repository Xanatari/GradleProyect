package com.gradel.rest.service.gradlerestservice.controller.implementations;

import com.gradel.rest.service.gradlerestservice.controller.contracts.IGenericController;
import com.gradel.rest.service.gradlerestservice.dtos.Request.Generics.GenericRequest;
import com.gradel.rest.service.gradlerestservice.dtos.Response.Generics.GenericResponse;
import com.gradel.rest.service.gradlerestservice.service.contracs.IGenericService;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(path = "/customer")
public class CustomerContoler implements IGenericController {

    private  static  final Logger LOGGER = LogManager.getLogger(CustomerContoler.class);

    IGenericService iGenericService;

    @Autowired
    public CustomerContoler (IGenericService iGenericService){
        this.iGenericService = iGenericService;
    }

    @Override
    @GetMapping (path = "/info" )
    public ResponseEntity<Object> registerUser(HttpHeaders httpHeaders, GenericRequest genericRequestCustomer) {
        LOGGER.info("First Endpoint to creat customer ");

        return GenericResponse.builder().code(HttpStatus.OK.toString()).build();
    }
}
