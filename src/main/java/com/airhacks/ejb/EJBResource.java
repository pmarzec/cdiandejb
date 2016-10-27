/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author pmarzec
 */
@Stateless
@Path("ejb")
public class EJBResource {
    
    @Inject
    private EJBBoundary boundary;
    
    @GET
    public String message() {
        return boundary.message();
    }
}
