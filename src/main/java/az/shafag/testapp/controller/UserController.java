package az.shafag.testapp.controller;

import az.shafag.testapp.dto.UserDTO;
import az.shafag.testapp.model.Users;
import az.shafag.testapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void save(@RequestBody Users users){
        userService.save(users);
    }

    @GetMapping("/all")
    public Set<UserDTO> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

}
