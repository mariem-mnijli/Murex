package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.stage.spring.entity.Mission;

@Repository
public interface MissionRepository extends CrudRepository<Mission,Integer> {

}
