package tn.esprit.asi.ski_projectt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.asi.ski_projectt.entities.Skieur;
import tn.esprit.asi.ski_projectt.entities.TypeAbonnement;
import tn.esprit.asi.ski_projectt.entities.TypeCours;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    @Query("select s from skieurs s where s.abonnement.typeAbon = ?1")
    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);
    List<Skieur> findByInscriptionsCoursTypeCours(TypeCours typeCours);
}
