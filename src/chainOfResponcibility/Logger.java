package chainOfResponcibility;

public abstract class Logger {
	public static int information = 1;
	public static int warning = 2;
	public static int error = 3;
	protected int level;
	protected Logger nextLogger;
	
	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}
	
	public void loggerMessage(int level, String message) {
		
		if(this.level <= level) {
			this.writeMessage(message);
		}
		if(this.nextLogger != null) {
			this.nextLogger.loggerMessage(level, message);
		}
		
	}
	
	abstract protected void writeMessage(String message);
}
