package tn.esprit.asi.ski_projectt.services;

import tn.esprit.asi.ski_projectt.entities.Cours;
import tn.esprit.asi.ski_projectt.entities.Moniteur;
import tn.esprit.asi.ski_projectt.entities.Support;

import java.util.List;
import java.util.Map;

public interface IMoniteurService {
    void add(Moniteur a);
    Moniteur update(Moniteur a);
    List<Moniteur> getAll();
    Moniteur getById(long id);
    void remove(long id);
    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);
    Moniteur addMoniteurAndAssignToCourse(Moniteur moniteur, Long numCours);
    /*Map<Cours,Integer> mapWeeksCourseOfInstructorBySupport(Long numIns>;*/
}
