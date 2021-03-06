package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.dto.DtoActionFonction;
import fr.springboot.prog4fun.entity.Action;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://prog4fun.s3-website.eu-west-3.amazonaws.com")
public interface ActionRepository extends JpaRepository<Action, Integer> {

    // Récupérer l'action avec la fonction et l'outil qui lui est associée pour un outil.
    @Query("SELECT new fr.springboot.prog4fun.dto.DtoActionFonction(a.id, f.nomFonction, a.numEtape, a.nomFichier, a.detail, a.ligneCommande, o.nom) "
            + "FROM Fonction f INNER JOIN f.mesActions a INNER JOIN a.actionPourOutil o where a.actionPourOutil.id=?1")
    Page<DtoActionFonction> actionFonctionOutil(@RequestParam("id") Integer id, Pageable pageable);
}

