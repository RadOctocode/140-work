package assignment07;

public class Num extends Expr{
	private int value;

	public Num(int myVal){
		value=myVal;
	}


	public int eval(){
		return value;
	}

}