package tn.esprit.asi.ski_projectt.services;

import tn.esprit.asi.ski_projectt.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    void add(Inscription a);
    Inscription update(Inscription a);
    List<Inscription> getAll();
    Inscription getById(long id);
    void remove(long id);
    Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);
}
