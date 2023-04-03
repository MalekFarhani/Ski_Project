package tn.esprit.asi.ski_projectt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski_projectt.entities.Piste;

public interface PisteRepository extends CrudRepository<Piste,Long> {

}
