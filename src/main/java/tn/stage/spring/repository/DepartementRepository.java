package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.stage.spring.entity.Departement;

@Repository
public interface DepartementRepository extends CrudRepository<Departement,Integer> {

}
