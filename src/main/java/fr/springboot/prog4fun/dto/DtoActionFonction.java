package fr.springboot.prog4fun.dto;

import lombok.Data;
import javax.persistence.*;

// Cette classe me permet de faire le lien entre la commande, la fonction et l'outil.
// Ceci n'est pas une vraie entité (elle n'est pas reliée à une table).
@Entity
@Data
@SqlResultSetMapping(name="ActionFonction",
        entities={
                @EntityResult(entityClass= DtoActionFonction.class, fields={
                        @FieldResult(name="idAction", column="id_action"),
                        @FieldResult(name="nomAction", column="nom_action"),
                        @FieldResult(name="numEtape", column="num_etape"),
                        @FieldResult(name="nomFichier", column="nom_fichier"),
                        @FieldResult(name="detail", column="detail"),
                        @FieldResult(name="ligneCommande", column="ligne_commande"),
                        @FieldResult(name="nomOutil", column="nom_outil")})
        })
public class DtoActionFonction {

    @Id
    private int idAction;
    private String nomAction;
    private int numEtape;
    private String nomFichier;
    private String detail;
    private String ligneCommande;
    private String nomOutil;

    // L'ordre pour le constructeur correspond à l'ordre pour le select au niveau des web-services.
    public DtoActionFonction(int idAction, String nomAction, int numEtape, String nomFichier,
                             String detail, String ligneCommande, String nomOutil) {
        this.idAction = idAction;
        this.nomAction = nomAction;
        this.numEtape = numEtape;
        this.nomFichier = nomFichier;
        this.detail = detail;
        this.ligneCommande = ligneCommande;
        this.nomOutil = nomOutil;
    }

}
