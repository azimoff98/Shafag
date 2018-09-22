package az.shafag.testapp.registry;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class AbstractFactory implements ApplicationContextAware {


    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    public <T> T get(String name, Class<T> clazz){
        return  context.getBean(name, clazz);
    }
    public <T> T get(Class<T> clazz){
        return  context.getBean(clazz);
    }

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }
}
