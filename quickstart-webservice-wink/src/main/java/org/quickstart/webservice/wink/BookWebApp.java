package org.quickstart.webservice.wink;

/**
 *
 * The Book web application class that extends Application
 * with the methods getSingletons and getClasses
 *
 * @author Gabriel Mateescu, gabriel@vt.edu
 */

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class BookWebApp extends Application {

    /*
     * A singletons is used to serve multiple requests.  
     * It keeps domain-model objects in memory between requests.   
     */
    private Set<Object> svc_singletons = new HashSet<Object>();

    /* 
     * Per-request service classes are instantiated for each 
     * request, and disposed of after the request is processed.
    */
    private Set<Class<?>> svc_classes = new HashSet<Class<?>>();

    /**
     * Create the singleton service implementation
     */
    public BookWebApp() {
        svc_singletons.add(BookServiceImpl.getInstance());
        svc_singletons.add(new HelloWorldResource());
    }

    /**
     * Methods used to discover the JAX-RS service objects
     */

    // Set of singleton service objects
    @Override
    public Set<Object> getSingletons() {
        return svc_singletons;
    }

    // Set of per-request service classes
    @Override
    public Set<Class<?>> getClasses() {
        return svc_classes;
    }

}
