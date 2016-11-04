package assignment07;

public class Neg extends Expr{

	private Expr value;

	public Neg(Expr myVal){
		value=myVal;

	}

	public int eval(){

		int returnValue=0;
		int valueInt=value.eval();
		if(valueInt<=0){

			returnValue=1;
		}
		return returnValue;
	}


}