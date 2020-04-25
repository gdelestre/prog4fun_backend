package fr.springboot.prog4fun.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "langage")
public class Langage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    private String utilisation;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "outilDeLangage")
    private Set<Outil> lesOutils;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commandePourLangage")
    private Set<Commande> lesCommandes;

}
