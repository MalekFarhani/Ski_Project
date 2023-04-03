package tn.esprit.asi.ski_projectt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_projectt.entities.Inscription;
import tn.esprit.asi.ski_projectt.services.IInscriptionService;

import java.util.List;

@RestController
@RequestMapping("/inscription")
public class InscriptionController {
    @Autowired
    private IInscriptionService inscriptionService;
    @PostMapping()
    public Inscription addInscription(@RequestBody Inscription inscription) //requestBody : tell the program to look at the body of the http request for a skieur object (in the JSON data)
    {
        inscriptionService.add(inscription);
        return inscription;
    }

    @GetMapping()
    public List<Inscription> getAllInscription(){
        return inscriptionService.getAll();
    }

    @PutMapping()
    public Inscription updateInscription(@RequestBody Inscription inscription){
        inscriptionService.update(inscription);
        return inscription;
    }

    @GetMapping("/{id}")
    public Inscription getInscription(@PathVariable("id")Long id) {
        return inscriptionService.getById(id);
    }

    @DeleteMapping
    public void deleteInscription(@RequestBody Inscription inscription) {
        inscriptionService.remove(inscription.getNumInscription());
    }
}
