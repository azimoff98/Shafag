package az.shafag.testapp.controller;

import az.shafag.testapp.dto.SearchDTO;
import az.shafag.testapp.registry.AbstractFactory;
import az.shafag.testapp.registry.MethodRegistry;
import az.shafag.testapp.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

@RestController
public class MainController {

    @Autowired
    AbstractFactory factory;

    @Autowired
    MethodRegistry methodRegistry;

    @PostMapping("/{serviceName}/{methodName}")
    public <T, E> E handlePost(@RequestBody SearchDTO t,
                               @PathVariable("serviceName") String serviceName,
                               @PathVariable("methodName") String methodName) throws InvocationTargetException, IllegalAccessException {
        return (E) methodRegistry.getRegistry().get(serviceName).get(methodName).invoke(
                factory.get(serviceName, AbstractService.class), t
        );
    }

    @GetMapping("/{serviceName}/{methodName}")
    public <E> E handleGet(@RequestParam HashMap<String, String> t,
                           @PathVariable("serviceName") String serviceName,
                           @PathVariable("methodName") String methodName) throws InvocationTargetException, IllegalAccessException {

        return t.isEmpty() ? (E) methodRegistry.getRegistry().get(serviceName).get(methodName).invoke(
                factory.get(serviceName, AbstractService.class), null
        ) :
                (E) methodRegistry.getRegistry().get(serviceName).get(methodName).invoke(
                        factory.get(serviceName, AbstractService.class), t
                );
    }
}
