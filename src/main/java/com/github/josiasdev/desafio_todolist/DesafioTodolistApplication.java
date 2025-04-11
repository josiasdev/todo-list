package com.github.josiasdev.desafio_todolist;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "TodoList", version = "1", description = "API desenvolvida para testes de TodoList"))

public class DesafioTodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioTodolistApplication.class, args);
	}

}
