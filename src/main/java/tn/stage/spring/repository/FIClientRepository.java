package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.stage.spring.entity.FIClient;

@Repository
public interface FIClientRepository extends CrudRepository<FIClient,Integer>{

}