/*2. Create a menu driven application "TaskManager" to manage your day-to-day tasks. 

You can create a class Task with fields like taskId, taskName, description, taskDate, status, active. 
taskId should be unique and generated automatically.
status should be either PENDING, IN PROGRESS or COMPLETED.
active should be either true or false. Deleted task will have active=false 
Newly added task should have default status as PENDING and active=true

You can use suitable data structure to store data in memory.

Following functionalities are expected -

a. Add New Task                       
b. Delete a task                         
c. Update task status               
d. Display all pending tasks     
e. Display all pending tasks for today           
f. Display all tasks sorted by taskDate        

*/
package TaskManagerApp;

import java.time.LocalDate;

public class Task {
	private int taskId;
	private String taskName;
	private String description;
	LocalDate taskDate;
	private boolean active;
	TaskEnum en;
	private static int idGenerator = 0;

	// constructor
	public Task(String taskName, String description, LocalDate taskDate) {
		super();
		this.taskId = ++idGenerator;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.active = true;
		this.en = TaskEnum.PENDING;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public TaskEnum getEn() {
		return en;
	}

	public void setEn(TaskEnum en) {
		this.en = en;
	}

	public static int getIdGenerator() {
		return idGenerator;
	}

	public static void setIdGenerator(int idGenerator) {
		Task.idGenerator = idGenerator;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", active=" + active + ", en=" + en + "]";
	}

}
