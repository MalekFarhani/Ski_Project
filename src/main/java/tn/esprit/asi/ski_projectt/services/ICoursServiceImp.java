package tn.esprit.asi.ski_projectt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.asi.ski_projectt.entities.Cours;
import tn.esprit.asi.ski_projectt.repositories.CoursRepository;

import java.util.List;
@Service
public class ICoursServiceImp implements ICoursService{
    @Autowired
    private CoursRepository coursRepository;
    @Override
    public void add(Cours c) {
        coursRepository.save(c);
    }

    @Override
    public Cours update(Cours c) {
        return coursRepository.save(c);
    }

    @Override
    public List<Cours> getAll() {
        return (List<Cours>) coursRepository.findAll();
    }

    @Override
    public Cours getById(long id) {
        return coursRepository.findById(id).orElse(null);
    }

    @Override
    public void remove(long id) {
        coursRepository.deleteById(id);
    }
}
