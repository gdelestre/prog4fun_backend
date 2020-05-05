package fr.springboot.prog4fun.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Data
@Table(name = "outil")
public class Outil implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    @Column(name = "img_url")
    private String imgUrl;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_langage", nullable = false)
    private Langage outilDeLangage;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actionPourOutil")
    private Set<Action> mesActions;
}
