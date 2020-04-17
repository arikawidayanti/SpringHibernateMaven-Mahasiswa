/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.mahasiswaMavenProject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author arika widayanti
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        
    }
}
