package com.darylmathison.camel.rest;

import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.impl.UriEndpointComponent;

import java.util.Map;

/**
 * Represents the component that manages {@link RestEndpoint}.
 */
public class RestComponent extends UriEndpointComponent {
    
    public RestComponent() {
        super(RestEndpoint.class);
    }

    public RestComponent(CamelContext context) {
        super(context, RestEndpoint.class);
    }

    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new RestEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
