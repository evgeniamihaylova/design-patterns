package chainOfResponcibility;

public class LoggerWarning extends Logger{
	public LoggerWarning() {
		this.level = Logger.warning;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Warning message: " + message);
	}
}
