package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.dto.DtoUtilisationDeLangage;
import fr.springboot.prog4fun.entity.Langage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://prog4fun.s3-website.eu-west-3.amazonaws.com")
public interface LangageRepository extends JpaRepository<Langage, Integer> {

    @Query("SELECT new fr.springboot.prog4fun.dto.DtoUtilisationDeLangage(l.id, l.nom, u.nom) "
            + "FROM Utilisation u INNER JOIN u.mesLangages l ")
    List<DtoUtilisationDeLangage> langageAvecUtilisation();
}
