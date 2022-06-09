package co.simplon.p25.elise.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.p25.elise.dtos.TaskList;
import co.simplon.p25.elise.entities.MemberType;
import co.simplon.p25.elise.entities.Task;
import co.simplon.p25.elise.service.MemberTypeService;
import co.simplon.p25.elise.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	private final TaskService service;

	public TaskController(TaskService service) {
		this.service = service;
	}

	@GetMapping("/names")
	public List<Task> getTaskNames() {
		return service.getTaskNames();
	}

}