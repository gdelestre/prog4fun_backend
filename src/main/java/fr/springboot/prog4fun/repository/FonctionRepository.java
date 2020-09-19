package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.entity.Fonction;
import fr.springboot.prog4fun.view.FonctionComplete;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://prog4fun.s3-website.eu-west-3.amazonaws.com")
public interface FonctionRepository extends JpaRepository<Fonction, Integer> {

    @Query("select f from FonctionComplete f where f.nomFonction like %?1%")
    Page<FonctionComplete> mesFonctions(@RequestParam("keyword") String keyword, Pageable pageable);
}
