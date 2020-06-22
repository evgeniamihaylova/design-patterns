package chainOfResponcibility;

public class LoggerError extends Logger {
	public LoggerError() {
		this.level = Logger.error;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Error message: " + message);
	}
}
