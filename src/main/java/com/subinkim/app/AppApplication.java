package com.subinkim.app;

import com.subinkim.app.entity.Person;
import com.subinkim.app.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	private final PersonRepository personRepository;

	public AppApplication(PersonRepository personRepository){
		this.personRepository = personRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("김수빈", "데이터 분석","hello@test.com", "010-1234-5678"));
	}
}

