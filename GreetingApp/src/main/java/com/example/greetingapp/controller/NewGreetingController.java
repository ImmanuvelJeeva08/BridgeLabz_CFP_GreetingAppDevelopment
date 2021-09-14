/***************************************************************************************************************
 *
 * UC2 : Extend GreetingController to use Services Layer to get Simple Greeting message ”Hello World”
 *
 * @author : IMMANUVE JEEVA
 * @since  : 14-09-2021
 *
 ***************************************************************************************************************/
package com.example.greetingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.greetingapp.service.GreetingService;

@RestController
public class NewGreetingController {

    /**
     * Purpose : initialising and creating object for GreetingService.class
     */

    @Autowired
    private GreetingService greetingService;

    /**
     * Purpose : Ability to return message using GET method from the service class
     *
     * @return
     */

    @GetMapping(value = "/getMessage")
    public ResponseEntity<String> getMessage() {
        return new ResponseEntity<>(greetingService.getMessage(), HttpStatus.OK);
    }

    /**
     * Execution URL : http://localhost:8080/getMessage
     */

}