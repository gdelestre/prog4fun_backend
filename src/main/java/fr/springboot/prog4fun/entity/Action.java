package fr.springboot.prog4fun.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "action")
public class Action implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "num_etape")
    private int numEtape;

    @Column(name = "nom_fichier")
    private String nomFichier;

    private String detail;

    @Column(name = "ligne_commande")
    private String ligneCommande;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_fonction", nullable = false)
    private Fonction actionPourFonction;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_outil", nullable = false)
    private Outil actionPourOutil;
}
