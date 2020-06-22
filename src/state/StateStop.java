package state;

public class StateStop implements State {
private String nameOfState = "stop_state";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);
	}
	
	public String getStateName() {
		return this.nameOfState;
	}

}
