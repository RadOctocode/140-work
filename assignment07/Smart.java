package assignment07;
import java.lang.Math;
import java.util.Random;

public class Smart implements Play {
	
	@Override
	public int takeTurn(int currentState) {
		int returnValue=0;
		Random random = new Random();
		int numberLeft=currentState;
		if(currentState==1){
			returnValue=1;
		}
		if(Integer.bitCount(numberLeft)==1){
			returnValue=random.nextInt(currentState/2) + 1;
		}

		else{
		while(Integer.bitCount(numberLeft)!=1){
			returnValue++;
			numberLeft=currentState-returnValue;
			System.out.println(numberLeft);
			if(Integer.bitCount(numberLeft)==1){
				returnValue=returnValue+1;
				break;
			}
		}
	}
		return returnValue;
	}

}
