package tn.esprit.asi.ski_projectt.services;

import org.springframework.stereotype.Service;
import tn.esprit.asi.ski_projectt.entities.Abonnement;
import tn.esprit.asi.ski_projectt.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


public interface IAbonnementService {
    void add(Abonnement a);
    Abonnement update(Abonnement a);
    List<Abonnement> getAll();
    Abonnement getById(long id);
    void remove(long id);
    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);
    Set<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);
}
