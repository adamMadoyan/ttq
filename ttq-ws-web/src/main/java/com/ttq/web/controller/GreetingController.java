package com.ttq.web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Company: WeDooApps
 * Date: 6/23/16
 * <p>
 * Created by Adam Madoyan.
 */

@RestController
@RequestMapping(value = "/greeting", produces = {MediaType.APPLICATION_JSON_VALUE})
public class GreetingController {


    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello world!";
    }


}
