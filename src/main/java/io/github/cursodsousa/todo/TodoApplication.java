package io.github.cursodsousa.todo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;

import io.github.cursodsousa.todo.model.Todo;
import io.github.cursodsousa.todo.repository.TodoRepository;

@SpringBootApplication
@RestController
public class TodoApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
