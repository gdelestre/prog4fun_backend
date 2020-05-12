package fr.springboot.prog4fun.view;

import lombok.Data;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*Création d'une view côté SQL qui correspond aux fonctions avec les commandes ET les actions
 qui lui sont associées pour pouvoir rechercher une fonction avec son nom.
Cette classe lui fait référence.
 */
@Entity
@Data
@Immutable
@Table(name = "mes_fonctions_avec_commandes")
public class FonctionComplete {

    @Id
    int id;

    @Column(name = "nom_fonction")
    String nomFonction;

    @Column(name = "num_etape")
    int numEtape;

    @Column(name = "nom_fichier")
    String nomFichier;

    String detail;

    @Column(name = "ligne_commande")
    String ligneCommande;

    String nom;
}
