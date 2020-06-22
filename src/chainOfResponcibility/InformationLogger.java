package chainOfResponcibility;

public class InformationLogger extends Logger{
	public InformationLogger() {
		this.level = Logger.information;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("Information message: " + message);
	}

}
