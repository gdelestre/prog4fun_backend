package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.entity.Commande;
import fr.springboot.prog4fun.entity.Fonction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface FonctionRepository extends JpaRepository<Fonction, Integer> {
    Fonction findByMesCommandesId(@RequestParam("id") Integer id);
}
