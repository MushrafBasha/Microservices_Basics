package spring_micro_services.microservices_basics;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service

public class Services_microservices {
        @Autowired
        jpa_rep_microservices jpa;

        public enity_microservices create(enity_microservices data){
            return jpa.save(data);
        }

        public List<enity_microservices> read(){
            return jpa.findAll();
        }

        public enity_microservices readID(int id){
            return  jpa.findById(id).orElse(new enity_microservices());
        }

        public void Delete(int id){
            if(!jpa.existsById(id)){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The ID "+id +" is not in the Table");
            }
            jpa.deleteById(id);
        }

        public List<enity_microservices> get_itr(int itr_id){
            return jpa.findAllByItrNumber(itr_id);
        }

    }









