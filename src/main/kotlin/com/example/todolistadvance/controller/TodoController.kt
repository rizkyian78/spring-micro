package com.example.todolistadvance.controller

import com.example.todolistadvance.model.Todo
import com.example.todolistadvance.repository.TodoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
class TodoController {
    @Autowired
    lateinit var todoRepository: TodoRepository


    @PostMapping("/save")
    fun save(): String {

        todoRepository.save(Todo("Jack", "Smith"))
        todoRepository.save(Todo("Jack", "Smith"))
        todoRepository.save(Todo("Adam", "Johnson"))
        todoRepository.save(Todo("Kim", "Smith"))
        todoRepository.save(Todo("David", "Williams"))
        todoRepository.save(Todo("Peter", "Davis"))

        return "Done"
    }

    @GetMapping("/todo")
    @ResponseStatus(HttpStatus.OK)
    fun getallTodo(@RequestParam query: String, @RequestParam page: String): Unit {



    }
}
