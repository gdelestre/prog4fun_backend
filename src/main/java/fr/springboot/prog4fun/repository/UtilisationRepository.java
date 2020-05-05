package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.entity.Utilisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface UtilisationRepository extends JpaRepository<Utilisation,Integer> {
}
