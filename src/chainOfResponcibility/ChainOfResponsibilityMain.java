package chainOfResponcibility;

public class ChainOfResponsibilityMain {
	private static Logger getChain() {
		Logger loggerInfo = new InformationLogger();
		Logger loggerWarning = new LoggerWarning();
		Logger loggerError = new LoggerError();
		
		loggerError.setNextLogger(loggerWarning);
		loggerWarning.setNextLogger(loggerInfo);
		return loggerError;
	}
	
	public static void main(String[] args) {

		Logger chain = getChain();
		chain.loggerMessage(2, "Deprecated method");
		chain.loggerMessage(1, "Another message received");

	}
}
