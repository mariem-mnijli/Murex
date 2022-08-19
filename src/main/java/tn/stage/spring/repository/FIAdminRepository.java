package tn.stage.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.stage.spring.entity.FIAdmin;

@Repository
public interface FIAdminRepository extends CrudRepository<FIAdmin,Integer> {

}
