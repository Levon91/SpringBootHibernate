package com.example.server.rs;

import com.example.manager.IUserManager;
import com.example.model.User;
import com.example.server.path.PathConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.rmi.server.ServerNotActiveException;

/**
 * Created by levont on 25/10/2016.
 */
@RequestMapping(value = PathConstants.SERVICE)
@Produces(MediaType.APPLICATION_JSON)
@RestController
public class UserService extends BaseService {

    @Autowired
    private IUserManager testManager;

    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @RequestMapping(value = PathConstants.TEST)
    public void test(@FormParam("name") String name,
                     @FormParam("country") String country) {
        try {
            User user = new User();
            user.setName(name);
            user.setCountry(country);
            testManager.addUser(user);
        } catch (ServerNotActiveException e) {
            e.printStackTrace();
        }
    }

}
