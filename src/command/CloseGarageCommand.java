package command;

public class CloseGarageCommand implements Command{

	private GarageDoor door;
	
	public CloseGarageCommand(GarageDoor door) {
		this.door = door;
	}
	
	@Override
	public void execute() {	
		this.door.closeDoor();
	}

}
