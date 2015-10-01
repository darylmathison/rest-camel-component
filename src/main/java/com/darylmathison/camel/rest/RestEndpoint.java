package com.darylmathison.camel.rest;

import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;

/**
 * Represents a RestComponent endpoint.
 */
@UriEndpoint(scheme = "drmrest", title = "RestComponent", syntax="drmrest:name", label = "RestComponent")
public class RestEndpoint extends DefaultEndpoint {

    @UriParam(defaultValue = "get")
    private String method = "get";

    public RestEndpoint() {
    }

    public RestEndpoint(String uri, RestComponent component) {
        super(uri, component);
    }

    public Producer createProducer() throws Exception {
        return new RestProducer(this);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        throw new UnsupportedOperationException("cannot create a consumer");
    }

    public boolean isSingleton() {
        return true;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
