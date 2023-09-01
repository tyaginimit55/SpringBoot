package com.javaSessions.Spring.Boot.Demo.Project;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {

    static List<Task> tasks = new ArrayList<>();

    static {
        tasks.add(new Task(1, "task 1", false));
        tasks.add(new Task(2, "task 2", true));
        tasks.add(new Task(3, "task 3", false));
    }

    // get all tasks
    @GetMapping("/tasks")
    private List<Task> getAlltasks() {
        return tasks;
    }
    // get task by id
    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable int id){
        for (Task task: tasks) {
            if (task.getId() == id){
                return task;
            }
        }
        return null;
    }

    // creating a task
    @PostMapping("/tasks")
    public void creteTask(@RequestBody Task newTask){
        tasks.add(newTask);
    }
}
