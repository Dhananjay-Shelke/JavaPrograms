package TaskManagerApp;

public class TaskManagerExceptions extends Exception{
	String errMsg;

	public TaskManagerExceptions(String errMsg) {
		super();
		this.errMsg = errMsg;
	}
}
