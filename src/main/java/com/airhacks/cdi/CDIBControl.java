/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.cdi;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author pmarzec
 */
@RequestScoped
public class CDIBControl {
    
    public String message() {
        return "B " + System.currentTimeMillis();
    }
}
