package vhc.demo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vhc.demo.demo.entiti.Lol;

@Repository
public interface AppRepository extends CrudRepository<Lol, Long> {
    
}
