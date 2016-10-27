/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airhacks.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author pmarzec
 */
@Stateless
public class EJBAControl {
    
    public String message() {
        return "A " + System.currentTimeMillis();
    }
}
