package br.com.todolist;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@CrossOrigin("*")
public class TodoController {
    private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Todo> getAll() {
        return this.todoRepository.findAll();
    }
}
