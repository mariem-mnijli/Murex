package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.stage.spring.entity.Client;

@Repository
public interface ClientRepository extends CrudRepository<Client,Integer>{

}