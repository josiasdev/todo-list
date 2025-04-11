package com.github.josiasdev.desafio_todolist.service;

import com.github.josiasdev.desafio_todolist.entity.Todo;
import com.github.josiasdev.desafio_todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    /* Injeção de dependência:
    *  via atributo usando @Autowired
    *  via método.
    *  via construtor
    * */

    // Injeção de dependência via construtor.
    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    // listando todos e ordendando pela a prioridade maior e os nomes em ordem alfabética
    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    }
}
