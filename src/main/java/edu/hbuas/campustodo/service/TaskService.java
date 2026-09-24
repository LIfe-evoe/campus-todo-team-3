package edu.hbuas.campustodo.service;

import edu.hbuas.campustodo.model.Task;

import java.util.ArrayList;
import java.util.List;

/** 管理任务的增加和查询。 */
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private long nextId = 1;

    /** 新增任务，标题为空会抛异常。 */
    public Task addTask(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("任务标题不能为空");
        }
        Task task = new Task(nextId++, title);
        tasks.add(task);
        return task;
    }

    /** 返回全部任务的副本。 */
    public List<Task> listAll() {
        return new ArrayList<>(tasks);
    }
}
