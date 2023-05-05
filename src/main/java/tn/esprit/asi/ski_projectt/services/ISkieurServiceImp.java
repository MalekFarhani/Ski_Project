package tn.esprit.asi.ski_projectt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import tn.esprit.asi.ski_projectt.entities.Abonnement;
import tn.esprit.asi.ski_projectt.entities.Inscription;
import tn.esprit.asi.ski_projectt.entities.Skieur;
import tn.esprit.asi.ski_projectt.entities.TypeAbonnement;
import tn.esprit.asi.ski_projectt.repositories.AbonnementRepository;
import tn.esprit.asi.ski_projectt.repositories.InscriptionRepository;
import tn.esprit.asi.ski_projectt.repositories.PisteRepository;
import tn.esprit.asi.ski_projectt.repositories.SkieurRepository;

import java.util.List;
@Service
public class ISkieurServiceImp implements ISkieurService {
    //Injection de dépendances
    //the skieur repo is empty without instance
    //Spring Data JPA is the one that creates the instance on runtime
    //It scans the project for Interfaces that extends from JPARepo or SortingAndPagination or CrudRepository
    //The instances are located in the project context in the form of beans
    //It injects the instance to the variable with autowired
    //It is a dependency which is injected inside the variable.
    @Autowired
    private SkieurRepository skieurRepository;
    @Autowired
    private PisteRepository pisteRepository;
    @Autowired
    private AbonnementRepository abonnementRepository;
    @Autowired
    private InscriptionRepository inscriptionRepository;

    @Override
    @Transactional
    public void add(Skieur s) {
        //Traitement quelconque
        //Abonnement abonAjouter = s.getAbonnement();
        //Abonnement addedAbon = abonnementRepository.save(abonAjouter);
        //Skieur addedSkieur = skieurRepository.save(s);
        //addedSkieur.setAbonnement(addedAbon);
        //skieurRepository.save(addedSkieur);
        skieurRepository.save(s);
        //Abonnement abonAjouter1 = s.getAbonnement();
        //abonnementRepository.saveAndFlush(abonAjouter1);
        //skieurRepository.saveAndFlush(s);
        //s.setAbonnement(abonAjouter1);
        //skieurRepository.save(s);
    }

    @Override
    public Skieur update(Skieur s) {
        return skieurRepository.save(s);
    }

    @Override
    public List<Skieur> getAll() {
        return (List<Skieur>) skieurRepository.findAll();
    }

    @Override
    public Skieur getById(long id) {
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        skieurRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
        if (skieurRepository.existsById(numSkieur) && pisteRepository.existsById(numPiste)) {
            Skieur s = skieurRepository.findById(numSkieur).get();
            s.addPiste(pisteRepository.findById(numPiste).get());
            return s;
        }
        return null;
    }

    @Override
    public Skieur assignSkieurToAbon(Long numSkieur, Long numAbon) {
        if (skieurRepository.existsById(numSkieur) && abonnementRepository.existsById(numAbon)) {
            Skieur s = skieurRepository.findById(numSkieur).get();
            s.setAbonnement(abonnementRepository.findById(numAbon).get());
            return skieurRepository.save(s);
        }
        return null;
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur) {
        Assert.notNull(skieur.getAbonnement(), "must not be null");
        Assert.notNull(skieur.getInscriptions(), "must not be null");
        skieur.getInscriptions().forEach(inscription -> {
          Assert.notNull(inscription.getCours);
        }
        return null;
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return null;
    }

    /*@Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {

        return skieurRepository.findByAbonnementTypeAbon(typeAbonnement);
    }*/
}
