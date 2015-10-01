package com.darylmathison.camel.rest;

import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The RestComponent producer.
 */
public class RestProducer extends DefaultProducer {
    private static final Logger LOG = LoggerFactory.getLogger(RestProducer.class);
    private RestEndpoint endpoint;

    public RestProducer(RestEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody());    
    }

}
