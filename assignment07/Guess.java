package assignment07;

import java.util.Random;

public class Guess implements Play {
	private Random random = new Random();
	@Override
	public int takeTurn(int currentState) {
		if((currentState/2)>1){
		return(random.nextInt(currentState/2) + 1);
		}

		else{
			return(1);
		}
	}

}
