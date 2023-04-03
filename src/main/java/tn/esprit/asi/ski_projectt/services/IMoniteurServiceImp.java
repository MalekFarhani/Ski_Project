package tn.esprit.asi.ski_projectt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski_projectt.entities.Cours;
import tn.esprit.asi.ski_projectt.entities.Inscription;
import tn.esprit.asi.ski_projectt.entities.Moniteur;
import tn.esprit.asi.ski_projectt.entities.Support;
import tn.esprit.asi.ski_projectt.repositories.CoursRepository;
import tn.esprit.asi.ski_projectt.repositories.InscriptionRepository;
import tn.esprit.asi.ski_projectt.repositories.MoniteurRepository;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class IMoniteurServiceImp implements IMoniteurService {
    @Autowired
    private MoniteurRepository moniteurRepository;
    @Autowired
    private InscriptionRepository inscriptionRepository;
    @Autowired
    private CoursRepository coursRepository;
    @Override
    public void add(Moniteur m) {
        moniteurRepository.save(m);
    }

    @Override
    public Moniteur update(Moniteur m) {
        return moniteurRepository.save(m);
    }

    @Override
    public List<Moniteur> getAll() {
        return (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur getById(long id) {
        return moniteurRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        moniteurRepository.deleteById(id);

    }

    @Override
    public List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support) {
        return getById(numInstructor).getCoursList().stream()
                .flatMap(cours -> cours.getInscriptions().stream()).map(Inscription::getNumSemaine).collect(Collectors.toList());
    }

    @Override
    public Moniteur addMoniteurAndAssignToCourse(Moniteur moniteur, Long numCours) {

        Cours c = coursRepository.findById(numCours).orElse(null);
        if (c !=null)
        {
            moniteur.getCoursList().add(c);
            add(moniteur);
            return moniteur;

        }
        return null;
    }
}
