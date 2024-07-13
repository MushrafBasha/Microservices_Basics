package spring_micro_services.microservices_basics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface jpa_rep_microservices extends JpaRepository<enity_microservices,Integer> {
        List<enity_microservices> findAllByItrNumber(int itrNumber);
    }



