package tn.esprit.asi.ski_projectt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.asi.ski_projectt.entities.Cours;
import tn.esprit.asi.ski_projectt.entities.Support;

import java.util.List;

public interface CoursRepository extends CrudRepository<Cours,Long> {
    List<Cours> findBySupport(Support support);
}
