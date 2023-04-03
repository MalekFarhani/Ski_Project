package tn.esprit.asi.ski_projectt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.asi.ski_projectt.entities.Abonnement;
import tn.esprit.asi.ski_projectt.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.Set;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long> {
    Set<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);
    Set<Abonnement> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);

}
