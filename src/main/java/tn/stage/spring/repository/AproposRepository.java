package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.stage.spring.entity.Apropos;

@Repository
public interface AproposRepository extends CrudRepository<Apropos,Integer>{

}
