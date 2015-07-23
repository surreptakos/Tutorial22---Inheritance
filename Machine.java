
public class Machine {
	protected boolean isRunning;
	
	public Machine() {
		this.isRunning = false;
	}
	
	public void start() {
		this.isRunning = true;
		System.out.println("Machine started.");
	}
	
	public void stop() {
		this.isRunning = false;
		System.out.println("Machine stopped.");
	}

}
