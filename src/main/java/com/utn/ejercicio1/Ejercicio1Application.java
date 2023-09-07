package com.utn.ejercicio1;

import com.utn.ejercicio1.entidades.Cliente;
import com.utn.ejercicio1.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class Ejercicio1Application {


	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
		System.out.println("------funciono poco--------");

	}
}


