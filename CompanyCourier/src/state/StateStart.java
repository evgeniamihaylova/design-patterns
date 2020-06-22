package state;

public class StateStart implements State{
private String nameOfState = "start_state";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.nameOfState;
	}
}
