package command;

public class OpenGarageCommand implements Command {
	
	private GarageDoor door;
	
	public OpenGarageCommand(GarageDoor door) {
		this.door = door;
	}
	
	
	@Override
	public void execute() {
		this.door.openDoor();
	}

}
