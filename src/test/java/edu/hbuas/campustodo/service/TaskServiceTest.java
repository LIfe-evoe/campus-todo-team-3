package edu.hbuas.campustodo.service;

import edu.hbuas.campustodo.model.Task;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** 基线测试：新增任务和空标题校验。 */
class TaskServiceTest {

    @Test
    void addTask_shouldCreateTaskWithNextId() {
        TaskService service = new TaskService();
        Task task = service.addTask("完成实验报告");
        assertNotNull(task);
        assertEquals(1L, task.getId());
        assertEquals("完成实验报告", task.getTitle());
        assertFalse(task.isCompleted());
    }

    @Test
    void addTask_withBlankTitle_shouldThrow() {
        TaskService service = new TaskService();
        assertThrows(IllegalArgumentException.class, () -> service.addTask("   "));
        assertThrows(IllegalArgumentException.class, () -> service.addTask(""));
        assertThrows(IllegalArgumentException.class, () -> service.addTask(null));
    }

    @Test
    void listAll_shouldReturnAllAddedTasks() {
        TaskService service = new TaskService();
        service.addTask("任务A");
        service.addTask("任务B");
        List<Task> all = service.listAll();
        assertEquals(2, all.size());
    }
}
