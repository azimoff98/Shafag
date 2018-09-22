package az.shafag.testapp.controller;

import az.shafag.testapp.registry.AbstractFactory;
import az.shafag.testapp.registry.MethodRegistry;
import az.shafag.testapp.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.InvocationTargetException;

@RestController
public class MainController {

    @Autowired
    AbstractFactory factory;

    @RequestMapping("/{serviceName}/{methodName}")
    public<T,E> E handle(@RequestBody T t, @PathVariable("serviceName") String serviceName, @PathVariable("methodName") String methodName) throws InvocationTargetException, IllegalAccessException {
        return (E) MethodRegistry.getRegistry().get(serviceName).get(methodName).invoke(
                factory.get(serviceName, AbstractService.class), t
        );
    }

}
