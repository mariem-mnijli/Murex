package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.stage.spring.entity.SousTraitant;

@Repository
public interface SousTraitantRepository extends CrudRepository<SousTraitant,Integer>{

}
