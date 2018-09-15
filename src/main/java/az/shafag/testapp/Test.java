package az.shafag.testapp;

import az.shafag.testapp.model.*;
import az.shafag.testapp.repository.VehicleRepository;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Test {

    @Autowired
    VehicleRepository repository;

    @PostConstruct
    public void init(){
        Vehicle v = new Vehicle();
        Brand b = new Brand();
        b.setLabel("NEW");
        b.setId(2L);
        Model m  = new Model();
        Differential d = new Differential();
        GearBox g = new GearBox();
        BodyType bt = new BodyType();
        FuelType ft = new FuelType();
        Color c = new Color();

        v.setBrand(b);
        v.setHorsePower(500);
        repository.save(v);


        System.out.printf("*******************START*******************");
        System.out.println(repository.findAll());;
        System.out.printf("*******************END*******************");
    }
}
