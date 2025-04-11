package com.github.josiasdev.desafio_todolist.controller;

import com.github.josiasdev.desafio_todolist.entity.Todo;
import com.github.josiasdev.desafio_todolist.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
@Tag(name = "TodoList", description = "Controlador responsável pela gestão de tarefas")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @Operation(summary = "Criação de uma nova tarefa", method = "POST")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "sucesso.", content = @Content()),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos.", content = @Content()),
            @ApiResponse(responseCode = "404", description = "Não encontrado", content = @Content()),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor.", content = @Content()  ),
    })
    @PostMapping
    List<Todo> create(@RequestBody @Valid Todo todo){
        return todoService.create(todo);
    }

    @Operation(summary = "Listagem de tarefas", method = "GET")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "sucesso.", content = @Content()),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos.", content = @Content()),
            @ApiResponse(responseCode = "404", description = "Não encontrado", content = @Content()),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor.", content = @Content()  ),
    })

    @GetMapping
    List<Todo> list(){
        return todoService.list();
    }


    @Operation(summary = "Atualizar tarefa", method = "PUT")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "sucesso.", content = @Content()),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos.", content = @Content()),
            @ApiResponse(responseCode = "404", description = "Não encontrado", content = @Content()),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor.", content = @Content()  ),
    })
    @PutMapping
    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }


    @Operation(summary = "Deletar tarefa", method = "PUT")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "sucesso.", content = @Content()),
            @ApiResponse(responseCode = "400", description = "Parâmetros inválidos.", content = @Content()),
            @ApiResponse(responseCode = "404", description = "Não encontrado", content = @Content()),
            @ApiResponse(responseCode = "500", description = "Erro interno no servidor.", content = @Content()  ),
    })

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
