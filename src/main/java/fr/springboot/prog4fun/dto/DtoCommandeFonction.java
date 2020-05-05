package fr.springboot.prog4fun.dto;

import lombok.Data;
import javax.persistence.*;


// Cette classe me permet de faire le lien entre la commande, la fonction et la fonction.
// Ceci n'est pas une vraie entité (elle n'est pas reliée à une table).
@Entity
@Data
@SqlResultSetMapping(name="CommandeFonction",
        entities={
                @EntityResult(entityClass= DtoCommandeFonction.class, fields={
                        @FieldResult(name="idCommande", column="id_commande"),
                        @FieldResult(name="nomCommande", column="nom_commande"),
                        @FieldResult(name="detailCommande", column="detail_commande"),
                        @FieldResult(name="ligneCommande", column="ligne_commande"),
                        @FieldResult(name="nomLangage", column="nom_langage")})
        })
public class DtoCommandeFonction {

    @Id
    private int idCommande;
    private String nomCommande;
    private String detailCommande;
    private String ligneCommande;
    private String nomLangage;

    // L'ordre pour le constructeur correspond à l'ordre pour le select au niveau des web-services.
    public DtoCommandeFonction(int idCommande, String nomCommande, String detailCommande, String ligneCommande, String nomLangage) {
        this.idCommande = idCommande;
        this.nomCommande = nomCommande;
        this.detailCommande = detailCommande;
        this.ligneCommande = ligneCommande;
        this.nomLangage = nomLangage;
    }

}
