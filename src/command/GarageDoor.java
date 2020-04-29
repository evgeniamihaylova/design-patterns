package command;

public class GarageDoor {

	private Boolean doorOpen;
	
		public void openDoor() {
			System.out.println("The door is open");
			this.doorOpen = true;
		
		}
		
		public void closeDoor() {
			System.out.println("The door is closed");
			this.doorOpen = false;
		}
	
}
