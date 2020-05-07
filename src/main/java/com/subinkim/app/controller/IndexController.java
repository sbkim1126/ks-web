package com.subinkim.app.controller;

import com.subinkim.app.entity.Person;
import com.subinkim.app.entity.SocialMedia;
import com.subinkim.app.repository.PersonRepository;
import com.subinkim.app.repository.SocialMediaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final PersonRepository personRepository;
    private final SocialMediaRepository socialMediaRepository;

    public IndexController(PersonRepository personRepository, SocialMediaRepository socialMediaRepository){
        this.personRepository = personRepository;
        this.socialMediaRepository = socialMediaRepository;
    }

    @GetMapping("/")
    public String index(Model model){
        Person person = personRepository.findAll().stream().findFirst().orElse(null);
        model.addAttribute("person", person);
        SocialMedia socialMedia = socialMediaRepository.findAll().stream().findFirst().orElse(null);
        model.addAttribute("socialMedia", socialMedia);
        return "resume";
    }
}
