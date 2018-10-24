package az.shafag.testapp.registry;

import az.shafag.testapp.annotation.ServiceMethod;
import org.reflections.Reflections;
import org.reflections.scanners.MethodAnnotationsScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.scanners.TypeAnnotationsScanner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import static az.shafag.testapp.logger.Log.*;

@Component
public class MethodRegistry {

    private static Map<String, Map<String, Method>> registry;

    @PostConstruct
    void init() {
        registry = new HashMap<>();
        update();
    }


    private static void update(){
        Reflections reflections = new Reflections("", new TypeAnnotationsScanner(), new SubTypesScanner());
        Reflections reflections1;
        Service service;
        ServiceMethod serviceMethod;
        for(Class clazz : reflections.getTypesAnnotatedWith(Service.class)){
            service =(Service)clazz.getAnnotation(Service.class);
            reflections1 = new Reflections(clazz.getName(), new MethodAnnotationsScanner());
            Map<String, Method> methodMap;
            String methodName;
            info("SERVICE NAME :" + service.value());
            for(Method method : reflections1.getMethodsAnnotatedWith(ServiceMethod.class)){
                methodName = getMethodName(method);
                info("METHOD NAME :" + methodName);
                if((methodMap = registry.get(service.value())) == null){
                    methodMap = new HashMap<>();
                    methodMap.put(methodName, method);
                    registry.put(service.value(), methodMap);
                }else{
                    methodMap.put(methodName, method);
                    registry.replace(service.value(), methodMap);
                }
            }

        }
    }

    private static String getMethodName(Method method){
        ServiceMethod serviceMethod = method.getAnnotation(ServiceMethod.class);
        return serviceMethod.name().isEmpty() ? method.getName() : serviceMethod.name();

    }

    public static Map<String, Map<String, Method>> getRegistry() {
        return registry;
    }

    public static void setRegistry(Map<String, Map<String, Method>> registry) {
        MethodRegistry.registry = registry;
    }
}


