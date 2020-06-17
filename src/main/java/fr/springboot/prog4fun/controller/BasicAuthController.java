package fr.springboot.prog4fun.controller;

import fr.springboot.prog4fun.bean.AuthenticationBean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://prog4fun.s3-website.eu-west-3.amazonaws.com")
@RestController
public class BasicAuthController {

    @GetMapping(path = "/authentification")
    public AuthenticationBean basicauth() {
        return new AuthenticationBean("Authentification réussie");
    }
}
