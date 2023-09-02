package com.javaSessions.Spring.Boot.Demo.Project;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    static List<Task> tasks = new ArrayList<>();

    static {
        tasks.add(new Task(1, "task 1", false));
        tasks.add(new Task(2, "task 2", true));
        tasks.add(new Task(3, "task 3", false));
    }

    // get all tasks
    @GetMapping("/")
    private List<Task> getAlltasks() {
        return tasks;
    }
    // get task by id
    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id){
        for (Task task: tasks) {
            if (task.getId() == id){
                return task;
            }
        }
        return null;
    }

    // creating a task
    @PostMapping("/")
    public void creteTask(@RequestBody Task newTask){
        tasks.add(newTask);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable int id, @RequestBody Task taskToBeUpdated){
        for (Task task: tasks ) {
            if (task.getId() == id){
                task.setName(taskToBeUpdated.getName());
                task.setCompleted(taskToBeUpdated.isCompleted());
                return taskToBeUpdated;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public Task deleteTask(@PathVariable int id){
        for (Task task: tasks  ) {
            if (task.getId() == id){
                tasks.remove(task);
                return task;
            }
        }
        return null;
    }
}
