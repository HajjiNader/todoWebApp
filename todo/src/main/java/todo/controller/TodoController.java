package todo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import todo.model.Todo;
import todo.repositories.TodoRepository;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {


    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/findall")

    public List<Todo> fetchAll(){

        return  todoRepository.findAll();
    }

@PostMapping("/add")

    public ResponseEntity<?> addTodo(@RequestBody Todo todo){

        return new ResponseEntity<>(this.todoRepository.save(todo), HttpStatus.CREATED);
    }
}
