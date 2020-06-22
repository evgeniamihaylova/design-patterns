package state;

public class StateMain {
	public static void main(String[] args) {

		Context employee1 = new Context("Employee1");
		Context employee2 = new Context("Employee2");
		
		StateStart startState = new StateStart();
		StateStop  stopState = new StateStop();
		
		startState.applyState(employee1);
		stopState.applyState(employee2);
		
		State stateOfPlayer = employee1.getState();
		String currentState = stateOfPlayer.getStateName();
		System.out.println("Current state: " + currentState);
			
	}

}
