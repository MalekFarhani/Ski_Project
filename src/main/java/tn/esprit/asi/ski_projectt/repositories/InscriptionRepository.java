package tn.esprit.asi.ski_projectt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski_projectt.entities.Inscription;
import tn.esprit.asi.ski_projectt.entities.Support;


import java.util.List;

public interface InscriptionRepository extends CrudRepository<Inscription,Long> {
    List<Inscription> findByCours_Support(Support support);

}
