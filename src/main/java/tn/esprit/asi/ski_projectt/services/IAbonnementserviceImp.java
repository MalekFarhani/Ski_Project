package tn.esprit.asi.ski_projectt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski_projectt.entities.Abonnement;
import tn.esprit.asi.ski_projectt.entities.TypeAbonnement;
import tn.esprit.asi.ski_projectt.repositories.AbonnementRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class IAbonnementserviceImp implements IAbonnementService {
    @Autowired
    AbonnementRepository abonnementRepository;

    @Override
    public void add(Abonnement a) {
        abonnementRepository.save(a);
    }

    @Override
    public Abonnement update(Abonnement a) {
        return abonnementRepository.save(a);
    }

    @Override
    public List<Abonnement> getAll() {
        return (List<Abonnement>) abonnementRepository.findAll();
    }

    @Override
    public Abonnement getById(long id) {
        return abonnementRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        abonnementRepository.deleteById(id);
    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return abonnementRepository.findByTypeAbon(type);

    }

    @Override
    public Set<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {

        return abonnementRepository.findByDateDebutBetween(startDate,endDate);
    }
}
