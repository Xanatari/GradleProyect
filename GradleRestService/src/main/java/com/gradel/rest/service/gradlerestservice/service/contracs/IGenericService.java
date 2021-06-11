package com.gradel.rest.service.gradlerestservice.service.contracs;

import com.gradel.rest.service.gradlerestservice.constans.ConnectorBussinessConstants;
import com.gradel.rest.service.gradlerestservice.dtos.Request.Generics.GenericRequest;
import com.gradel.rest.service.gradlerestservice.dtos.Response.Generics.GenericResponse;

public interface IGenericService {

    GenericResponse reurnCustomerInfo (ConnectorBussinessConstants connectorBussinessConstants, GenericRequest genericRequest  );
}
