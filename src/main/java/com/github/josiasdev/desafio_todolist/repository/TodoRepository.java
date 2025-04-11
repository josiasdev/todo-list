package com.github.josiasdev.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.josiasdev.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
