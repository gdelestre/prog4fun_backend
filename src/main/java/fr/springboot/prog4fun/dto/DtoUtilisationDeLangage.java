package fr.springboot.prog4fun.dto;

import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@SqlResultSetMapping(name="UtilisationLangage",
        entities={
                @EntityResult(entityClass= DtoUtilisationDeLangage.class, fields={
                        @FieldResult(name="idLangage", column="id_langage"),
                        @FieldResult(name="nomLangage", column="nom_langage"),
                        @FieldResult(name="nomUtilisation", column="nom_utilisation")})
        })
public class DtoUtilisationDeLangage {

    @Id
    private int idLangage;
    private String nomLangage;
    private String nomUtilisation;

    // L'ordre pour le constructeur correspond à l'ordre pour le select au niveau des web-services.
    public DtoUtilisationDeLangage(int idLangage, String nomLangage, String nomUtilisation) {
        this.idLangage = idLangage;
        this.nomLangage = nomLangage;
        this.nomUtilisation = nomUtilisation;
    }

}
