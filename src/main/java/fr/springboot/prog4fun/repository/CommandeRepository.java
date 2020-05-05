package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.dto.DtoCommandeFonction;
import fr.springboot.prog4fun.entity.Commande;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:4200")
public interface CommandeRepository extends JpaRepository<Commande, Integer> {

    // Récupérer la commande avec la fonction et le langage qui lui est associée pour un langage.
    @Query("SELECT new fr.springboot.prog4fun.dto.DtoCommandeFonction(c.id, f.nomFonction, c.detail, c.ligneCommande, l.nom) "
            + "FROM Fonction f INNER JOIN f.mesCommandes c INNER JOIN c.commandePourLangage l where c.commandePourLangage.id=?1")
    Page<DtoCommandeFonction> commandeFonctionLangage(@RequestParam("id") Integer id, Pageable pageable);


    // Récupère la commande avec la fonction et le langage pour une fonction contenant un mot
    @Query("SELECT new fr.springboot.prog4fun.dto.DtoCommandeFonction(c.id, f.nomFonction, c.detail, c.ligneCommande, l.nom) "
            + "FROM Fonction f INNER JOIN f.mesCommandes c INNER JOIN c.commandePourLangage l where f.nomFonction LIKE %?1%")
    Page<DtoCommandeFonction> commandeFonctionLangageSearch(@RequestParam("keyword") String keyword, Pageable pageable);
}
