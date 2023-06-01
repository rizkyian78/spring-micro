package com.example.todolistadvance.repository

import com.example.todolistadvance.model.Todo
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository



@Repository
interface TodoRepository : CrudRepository<Todo, Long> {

    fun findByTitle(title: String): Iterable<Todo>
}