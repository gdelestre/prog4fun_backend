package fr.springboot.prog4fun.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "fonction")
public class Fonction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nom_fonction")
    String nomFonction;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commandePourFonction")
    private Set<Commande> mesCommandes;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actionPourFonction")
    private Set<Action> mesActions;
}
