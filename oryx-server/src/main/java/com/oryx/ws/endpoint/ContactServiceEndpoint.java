package com.oryx.ws.endpoint;

import com.oryx.ws.ContactWSRequest;
import com.oryx.ws.ContactWSResponse;
import org.apache.log4j.Logger;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 * The Class UserService.
 */

/*
    http://localhost:8080/oryx/endpoint/ContactService.wsdl
 */
@Endpoint
public class ContactServiceEndpoint {

    final static Logger logger = Logger.getLogger(ContactServiceEndpoint.class);

    @PayloadRoot(localPart = TargetNameSpace.REQUEST_LOCAL_PORT, namespace = TargetNameSpace.TARGET_NAMESPACE_CONTACT)
    public
    @ResponsePayload
    ContactWSResponse ask(@RequestPayload ContactWSRequest request) {
        return null;
    }
}