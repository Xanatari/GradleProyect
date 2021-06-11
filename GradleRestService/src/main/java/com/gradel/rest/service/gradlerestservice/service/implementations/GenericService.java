package com.gradel.rest.service.gradlerestservice.service.implementations;

import com.gradel.rest.service.gradlerestservice.constans.ConnectorBussinessConstants;
import com.gradel.rest.service.gradlerestservice.dtos.Request.Generics.GenericRequest;
import com.gradel.rest.service.gradlerestservice.dtos.Response.Generics.GenericResponse;
import com.gradel.rest.service.gradlerestservice.service.contracs.IGenericService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class GenericService implements IGenericService {

    private  static  final Logger LOGGER = LogManager.getLogger(GenericService.class);

    @Override
    public GenericResponse reurnCustomerInfo(ConnectorBussinessConstants connectorBussinessConstants, GenericRequest genericRequest) {
        return null;
    }
}
