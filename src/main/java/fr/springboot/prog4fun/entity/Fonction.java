package fr.springboot.prog4fun.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name = "fonction")
public class Fonction implements Serializable {

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
