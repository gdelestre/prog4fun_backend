package fr.springboot.prog4fun.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
@Table(name = "outil")
public class Outil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_langage", nullable = false)
    private Langage outilDeLangage;

    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actionPourOutil")
    private Set<Action> mesActions;
}
