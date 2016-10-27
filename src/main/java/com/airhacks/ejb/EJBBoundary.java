/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ejb;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author pmarzec
 */
@Stateless
public class EJBBoundary {
    
    @Inject
    private EJBAControl aControl;
    
    @Inject
    private EJBBControl bControl;
    
    public String message() {
        return "ejb: " + aControl.message() + bControl.message();
    }
}
