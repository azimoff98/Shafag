//package az.shafag.testapp;
//
//
//import az.shafag.testapp.dao.mapper.AdvertisementMapper;
//import az.shafag.testapp.dto.SearchDTO;
//import az.shafag.testapp.registry.MethodRegistry;
//import az.shafag.testapp.service.AdvertisementService;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//
//import static az.shafag.testapp.logger.Log.*;
//
//@Component
//public class Main {
//
//    @Autowired
//    AdvertisementMapper mapper;
//
//    @Autowired
//    AdvertisementService advertisementService;
//
//    @Autowired
//    ObjectMapper objectMapper;a
//
//    @Autowired
//    MethodRegistry methodRegistry;
//
//   @PostConstruct
//    public void init() throws JsonProcessingException, InterruptedException {
//        SearchDTO searchDTO = new SearchDTO();
//        info(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapper.getAllByFilter(searchDTO)));
//      info(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(advertisementService.getAll(searchDTO)));
//        info(methodRegistry
//                .getRegistry()
//               .get("advertisement")
//               .get("getAll"
//                .toString());
//        Thread.sleep(1000000L);
//    }
//}
