package tn.esprit.asi.ski_projectt.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name="pistes")

public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numPiste;

    private String nomPiste;

    @Enumerated(EnumType.STRING)
    private Couleur Couleur;
    private int longeur;
    private int pente;
    @ManyToMany(mappedBy = "pistes")
    @JsonIgnore
    private Set<Skieur> skieurList;

    public long getNumPiste() {
        return numPiste;
    }

    public void setNumPiste(long numPiste) {
        this.numPiste = numPiste;
    }

    public String getNomPiste() {
        return nomPiste;
    }

    public void setNomPiste(String nomPiste) {
        this.nomPiste = nomPiste;
    }

    public tn.esprit.asi.ski_projectt.entities.Couleur getCouleur() {
        return Couleur;
    }

    public void setCouleur(tn.esprit.asi.ski_projectt.entities.Couleur couleur) {
        Couleur = couleur;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getPente() {
        return pente;
    }

    public void setPente(int pente) {
        this.pente = pente;
    }

    public Set<Skieur> getSkieurList() {
        return skieurList;
    }

    public void setSkieurList(Set<Skieur> skieurList) {
        this.skieurList = skieurList;
    }
}
