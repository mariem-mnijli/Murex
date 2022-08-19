package tn.stage.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.stage.spring.entity.Blacklist;

@Repository
public interface BlacklistRepository extends JpaRepository<Blacklist, Long>{

}
