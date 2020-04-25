package fr.springboot.prog4fun.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String detail;

    @Column(name = "ligne_commande")
    private String ligneCommande;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_langage", nullable = false)
    private Langage commandePourLangage;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_fonction", nullable = false)
    private Fonction commandePourFonction;

}
