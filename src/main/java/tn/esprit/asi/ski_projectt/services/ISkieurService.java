package tn.esprit.asi.ski_projectt.services;

import tn.esprit.asi.ski_projectt.entities.Skieur;
import tn.esprit.asi.ski_projectt.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    void add(Skieur s);
    Skieur update(Skieur s);
    List<Skieur> getAll();
    Skieur getById(long id);
    void remove(long id);

    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);
    Skieur assignSkieurToAbon(Long numSkieur, Long numAbon);

    Skieur addSkierAndAssignToCourse(Skieur skieur);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

}
