package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.entity.Commande;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
    Page<Commande> findByCommandePourLangageId(@RequestParam("id") Integer id, Pageable pageable);
    
}
