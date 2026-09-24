package edu.hbuas.campustodo.service;

import edu.hbuas.campustodo.model.Priority;
import edu.hbuas.campustodo.model.Task;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskServiceTest {

    @Test
    void shouldAddTask() {
        TaskService service = new TaskService();

        var task = service.addTask("完成需求评审");

        assertEquals(1L, task.getId());
        assertEquals("完成需求评审", task.getTitle());
        assertFalse(task.isCompleted());
        assertEquals(1, service.listAll().size());
    }

    @Test
    void shouldRejectBlankTitle() {
        TaskService service = new TaskService();

        assertThrows(IllegalArgumentException.class,
                () -> service.addTask("   "));
    }

    @Test
    void newTaskShouldDefaultToMediumPriority() {
        TaskService service = new TaskService();

        Task task = service.addTask("写实验报告");

        assertEquals(Priority.MEDIUM, task.getPriority());
    }

    @Test
    void shouldFilterTasksByPriority() {
        TaskService service = new TaskService();

        Task high = service.addTask("高优先级任务");
        high.setPriority(Priority.HIGH);
        service.addTask("中优先级任务");

        List<Task> result = service.filterByPriority(Priority.HIGH);

        assertEquals(1, result.size());
        assertEquals(high.getId(), result.get(0).getId());
        assertEquals(Priority.HIGH, result.get(0).getPriority());
    }

    @Test
    void shouldReturnEmptyListWhenNoTaskMatchesPriority() {
        TaskService service = new TaskService();

        service.addTask("低优先级任务").setPriority(Priority.LOW);

        List<Task> result = service.filterByPriority(Priority.HIGH);

        assertTrue(result.isEmpty());
    }
}
