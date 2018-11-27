package az.shafag.testapp.controller;

import az.shafag.testapp.dto.RoleDTO;
import az.shafag.testapp.model.Role;
import az.shafag.testapp.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;


    @PostMapping
    public void save(@RequestBody Role role){
        roleService.save(role);
    }

    @GetMapping
    public Set<RoleDTO> getAll(){
        return roleService.getAll();
    }

    @GetMapping("/{id}")
    public RoleDTO getById(@PathVariable Long id){
        return roleService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        roleService.delete(id);
    }
}
