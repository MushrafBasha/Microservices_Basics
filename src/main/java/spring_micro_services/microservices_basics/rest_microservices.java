package spring_micro_services.microservices_basics;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/ItrReturns")
public class rest_microservices {
        @Autowired
        Services_microservices services;

        @GetMapping("/get")
        public List<enity_microservices> get(){
            return services.read();
        }

        @GetMapping("/getItr/{id}")
        public List<enity_microservices> get_itr(@PathVariable("id") int id){
            return services.get_itr(id);
        }

        @PostMapping("/post")
        public enity_microservices post(@RequestBody enity_microservices data){
            return services.create(data);
        }

        @GetMapping("/getId/{id}")
        public enity_microservices getID(@PathVariable("id") int id){
            return services.readID(id);
        }

        @PutMapping("/put")
        public enity_microservices put(@RequestBody enity_microservices Update_data){
            return services.create(Update_data);
        }

        @DeleteMapping("/del/{id}")
        public String del(@PathVariable("id") int id){
            try {
                services.Delete(id);
                return "The ID "+id+" is removed from table";
            }
            catch (ResponseStatusException values){
                throw values;
            }
        }
    }







