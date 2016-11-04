package assignment07;

public class Greedy implements Play {

	@Override
	public int takeTurn(int currentState) {
		int returnValue=0;
		if(currentState>1){
			returnValue=currentState/2;
		}

		else{
			returnValue=1;
		}
		return returnValue;
	}

}
