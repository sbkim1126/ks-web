package com.subinkim.app;

import com.subinkim.app.entity.*;
import com.subinkim.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository){
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("김수빈", "데이터 분석","hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anonymous", "anonymous"));
		interestsRepository.save(new Interests("게임하기"));
		interestsRepository.save(new Interests("유튜브보기"));
		skillRepository.save(new Skill("C", 50));
		skillRepository.save(new Skill("Spring",80));
		workRepository.save(new Work("게임 개발자", "a회사", "3년","게임개발 프로젝트에 참여하였음"));
		workRepository.save(new Work("웹 개발자", "b회사", "1년", "웹 관리를 하였음"));

	}

}