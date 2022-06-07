package co.simplon.p25.elise.service;

import java.util.List;

import co.simplon.p25.elise.entities.Task;
import co.simplon.p25.elise.repositories.TaskRepository;

public class TaskServiceImpl implements TaskService {

	private final TaskRepository tasks;

	public TaskServiceImpl(TaskRepository tasks) {
		this.tasks = tasks;
	}

	@Override
	public List<Task> getTaskNames() {
		return tasks.findAll();
	}

}