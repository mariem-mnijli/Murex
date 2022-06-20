package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.stage.spring.entity.StatutConsultation;

@Repository
public interface StatutConsultationRepository extends CrudRepository<StatutConsultation,Integer>{

}
