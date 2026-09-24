package edu.hbuas.campustodo.model;

/**
 * 待办任务：包含 id、标题与完成状态。
 */
public class Task {

    private final long id;
    private String title;
    private boolean completed;

    public Task(long id, String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("任务标题不能为空");
        }
        this.id = id;
        this.title = title;
        this.completed = false;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
