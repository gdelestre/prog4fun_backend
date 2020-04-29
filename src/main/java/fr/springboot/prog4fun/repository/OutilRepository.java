package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.entity.Outil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "http://localhost:4200")
public interface OutilRepository extends JpaRepository<Outil, Integer> {
    Page<Outil> findByOutilDeLangageId(@RequestParam("id") Integer id, Pageable pageable);

}
