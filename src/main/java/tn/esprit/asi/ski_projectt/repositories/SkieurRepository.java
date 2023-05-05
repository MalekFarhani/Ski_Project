package tn.esprit.asi.ski_projectt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.asi.ski_projectt.entities.Skieur;
import tn.esprit.asi.ski_projectt.entities.TypeAbonnement;
import tn.esprit.asi.ski_projectt.entities.TypeCours;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {
    /*@Query(value = "SELECT *" +
            "From Skieur s " +
            "JOIN abonnement a on " +
            "s.abonnement = a.numabon" +
            "WHERE a.type_abonnement = :typeabon", nativeQuery = true)

    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
    @Query(value = " SELECT s" +
            "FROM Skieur s " +
            "where s.abonnement.typeAbonnement :typeabonnement")
    public List<Skieur> retrieveSkiersBySubscriptionTypeSQL(@Param("typeAbon") TypeAbonnement typeAbonnement);
    @Query(value = " SELECT s" +
            "FROM Skieur s " +
            "where s.abonnement.typeAbonnement :typeabonnement")
    public List<Skieur> retrieveSkiersBySubscriptionTypeJPQL(@Param("typeAbon")TypeAbonnement typeAbonnement);
*/



}