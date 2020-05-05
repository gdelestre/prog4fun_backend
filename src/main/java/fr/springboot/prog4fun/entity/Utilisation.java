package fr.springboot.prog4fun.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "utilisation")
public class Utilisation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    @JsonManagedReference
    @OneToMany(mappedBy = "utilisationDuLangage", cascade = CascadeType.ALL)
    private Set<Langage> mesLangages;
}
