package fr.springboot.prog4fun.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Table(name = "langage")
public class Langage implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_utilisation", nullable = false)
    private Utilisation utilisationDuLangage;

    @JsonManagedReference
    @OneToMany(mappedBy = "outilDeLangage", cascade = CascadeType.ALL)
    private Set<Outil> mesOutils;

    @JsonManagedReference
    @OneToMany(mappedBy = "commandePourLangage")
    private Set<Commande> mesCommandes;
}
