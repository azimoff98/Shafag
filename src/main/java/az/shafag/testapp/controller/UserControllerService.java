package az.shafag.testapp.controller;

import az.shafag.testapp.model.Users;
import az.shafag.testapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;


/**
 * Created by Gurban on 6/1/2018.
 */

@RestController
@RequestMapping("/users")
//@CrossOrigin("http://localhost:8080")
public class UserControllerService {

    @Autowired
    private UserService userService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserControllerService(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/signUp")
    public void signUp(@RequestBody Users user) {
        System.out.println("SIGNUP REQUEST");
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userService.save(user);
    }


    @PostMapping("/test")
    public String test() {
        return "TEST IS WORKING";
    }
}
