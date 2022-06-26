package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.stage.spring.entity.Consultant;
@Repository
public interface ConsultantRepository extends CrudRepository<Consultant,Integer> {

}
