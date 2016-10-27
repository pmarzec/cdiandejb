/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author pmarzec
 */
@RequestScoped
public class CDIBoundary {
    
    @Inject
    private CDIAControl aControl;
    
    @Inject
    private CDIBControl bControl;
    
    public String message() {
        return "cdi: " + aControl.message() + bControl.message();
    }
}
