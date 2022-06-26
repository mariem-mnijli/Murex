package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.stage.spring.entity.Taches;


@Repository
public interface TachesRepository extends CrudRepository<Taches,Integer> {

}
