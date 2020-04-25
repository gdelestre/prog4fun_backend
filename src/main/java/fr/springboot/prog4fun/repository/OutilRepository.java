package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.entity.Outil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

public interface OutilRepository extends JpaRepository<Outil, Integer> {
    List<Outil> findByOutilDeLangageId(@RequestParam("id") Integer id);
}
