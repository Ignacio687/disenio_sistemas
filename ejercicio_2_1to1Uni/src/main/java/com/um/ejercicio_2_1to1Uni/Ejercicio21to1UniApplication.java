package com.um.ejercicio_2_1to1Uni;

import com.um.ejercicio_2_1to1Uni.entidades.Domicilio;
import com.um.ejercicio_2_1to1Uni.entidades.Persona;
import com.um.ejercicio_2_1to1Uni.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ejercicio21to1UniApplication {
	@Autowired
	PersonaRepository personaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio21to1UniApplication.class, args);
	}
	@Bean
	CommandLineRunner init(PersonaRepository personaRepo) {
		return args -> {
			System.out.println("-----------------ESTOY FUNCIONANDO---------");

			Persona persona = Persona.builder()
					.nombre("Juan")
					.apellido("Pérez")
					.edad(30)
					.build();
			//personaRepository.save(persona);
			Domicilio domicilio = Domicilio.builder()
					.calle("Colón")
					.numero(30)
					.build();
			persona.setDomicilio(domicilio);
			personaRepository.save(persona);
			Persona personaRecuperada = personaRepository.findById(persona.getId()).orElse(null);
			if (personaRecuperada != null){
				System.out.println("Nombre: " + personaRecuperada.getNombre());
				System.out.println("Apellido: " + personaRecuperada.getApellido());
				System.out.println("Edad: " + personaRecuperada.getEdad());
				System.out.println("Calle: " + personaRecuperada.getDomicilio().getCalle());
				System.out.println("Numero de calle: " + personaRecuperada.getDomicilio().getNumero());
			}
		};
	}
}
