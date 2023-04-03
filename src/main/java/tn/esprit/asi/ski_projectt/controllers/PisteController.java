package tn.esprit.asi.ski_projectt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.ski_projectt.entities.Piste;
import tn.esprit.asi.ski_projectt.services.IPisteService;

import java.util.List;

@RestController
@RequestMapping("/piste")
public class PisteController {
    @Autowired
    private IPisteService pisteService;

    @PostMapping()
    public Piste addPiste(@RequestBody Piste piste) //requestBody : tell the program to look at the body of the http request for a skieur object (in the JSON data)
    {
        pisteService.add(piste);
        return piste;
    }

    @GetMapping()
    public List<Piste> getAllPiste(){
        return pisteService.getAll();
    }

    @PutMapping()
    public Piste updatePiste(@RequestBody Piste piste){
        pisteService.update(piste);
        return piste;
    }

    @GetMapping("/{id}")
    public Piste getPiste(@PathVariable("id")Long id) {
        return pisteService.getById(id);
    }

    @DeleteMapping
    public void deletePiste(@RequestBody Piste piste) {
        pisteService.remove(piste.getNumPiste());
    }
}
