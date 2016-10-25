package com.example.server.rs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by levont on 25/10/2016.
 */
@RestController
public class TestService {

    @Produces(value = MediaType.APPLICATION_JSON)
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "{\"code\" : 200}";
    }
}
