package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.entity.Langage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
public interface LangageRepository extends JpaRepository<Langage, Integer> {
}
