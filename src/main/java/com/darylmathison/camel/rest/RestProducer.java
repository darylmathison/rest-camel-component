package com.darylmathison.camel.rest;

import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.impl.DefaultAsyncProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The RestComponent producer.
 */
public class RestProducer extends DefaultAsyncProducer {
    private static final Logger LOG = LoggerFactory.getLogger(RestProducer.class);
    private RestEndpoint endpoint;

    public RestProducer(RestEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    @Override
    public boolean process(Exchange exchange, AsyncCallback asyncCallback) {
        LOG.info("body:{}; uri:{}", exchange.getIn().getBody(String.class), endpoint.getEndpointUri());
        asyncCallback.done(true);
        return true;
    }
}
