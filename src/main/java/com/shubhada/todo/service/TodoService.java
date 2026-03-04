package com.shubhada.todo.service;

import com.shubhada.todo.model.Todo;
import com.shubhada.todo.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private final TodoRepository repository;

    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public List<Todo> getAllTodos() {
        return repository.findAll();
    }

    public Todo saveTodo(Todo todo) {
        return repository.save(todo);
    }

    public Todo updateTodo(Long id, Todo updatedTodo) {
        Todo existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        existing.setTitle(updatedTodo.getTitle());
        existing.setCompleted(updatedTodo.isCompleted());

        return repository.save(existing);
    }

    public void deleteTodo(Long id) {
        repository.deleteById(id);
    }
}