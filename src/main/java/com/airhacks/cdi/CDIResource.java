/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author pmarzec
 */
@RequestScoped
@Path("cdi")
public class CDIResource {
    
    @Inject
    private CDIBoundary boundary;
    
    @GET
    public String message() {
        return boundary.message();
    }
}
