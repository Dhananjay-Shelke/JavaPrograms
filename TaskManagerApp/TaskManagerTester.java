package TaskManagerApp;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskManagerTester {

	public static void main(String[] args) {

		Map<String, Task> tasks = new HashMap<>();
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = true;
			while (exit) {
				try {
					{
						System.out.println("**************************************************\n"
								+ "1. Add New Task \r\n" + "2. Delete a task \r\n" + "3. Update task status\r\n"
								+ "4. Display all pending tasks\r\n" + "5. Display all pending tasks for today\r\n"
								+ "6. Display all tasks sorted by taskDate\r\n7. Display All tasks \n0. Exit\n"
								+ "**************************************************");
						switch (sc.nextInt()) {

						case 1:
							System.out.println("TaskName, Description,TaskDate:");
							Task t1 = new Task(sc.next(), sc.next(), LocalDate.parse(sc.next()));
							tasks.put(t1.getTaskName(), t1);
							// tasks.put(null, t1);
							System.out.println("Task created with Id : " + t1.getTaskId());
							break;
						case 2:
							System.out.println("Enter taskName to delete: ");
							tasks.remove(sc.next());
							break;
						case 3:
							System.out.println("Enter the taskName and Status: ");
							String taskNm = sc.next();
							TaskEnum status = TaskEnum.valueOf(sc.next().toUpperCase());
							tasks.get(taskNm).setEn(status);
							System.out.println("Status Updated...");
							break;
						case 4:
							System.out.println("All pending tasks...");
							for (Task t : tasks.values()) {
								if (t.getEn().equals(TaskEnum.PENDING))
									System.out.println(t);
							}
							break;
						case 5:
							System.out.println("All pending tasks of today...");
							for (Task t : tasks.values()) {
								if (t.getEn().equals(TaskEnum.PENDING) && t.getTaskDate().equals(LocalDate.now()))
									System.out.println(t);
							}
							break;
						case 6:
							System.out.println("All tasks sorted by date...");

							tasks.values().stream().sorted(Comparator.comparing(Task::getTaskDate))
									.forEach(p -> System.out.println(p));

							break;
						case 7:
							for (Task t : tasks.values())
								System.out.println(t);
							break;
						case 0:
							exit = false;
							System.out.println("Exit Success\nThank you!!!");
							break;
						default:
							break;
						}
					}
				} catch (Exception e) {
					sc.nextLine();
				}
			}

		}
	}

}
