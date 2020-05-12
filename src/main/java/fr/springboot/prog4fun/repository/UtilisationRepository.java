package fr.springboot.prog4fun.repository;

import fr.springboot.prog4fun.entity.Utilisation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://prog4fun.s3-website.eu-west-3.amazonaws.com")
public interface UtilisationRepository extends JpaRepository<Utilisation,Integer> {
}
