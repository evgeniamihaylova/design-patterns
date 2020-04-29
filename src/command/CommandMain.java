package command;

public class CommandMain {

	public static void main(String[] args) {
		
		RemoteController remoteController = new RemoteController();
		GarageDoor doorOpen = new GarageDoor();
		
		Command openGarageCommand = new OpenGarageCommand(doorOpen);
		Command closeGarageCommand = new CloseGarageCommand(doorOpen);
		
		remoteController.setCommand(openGarageCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(closeGarageCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(openGarageCommand);
		remoteController.pressButton();
		
		remoteController.setCommand(closeGarageCommand);
		remoteController.pressButton();
	}

}
