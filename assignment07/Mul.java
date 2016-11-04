package assignment07;

public class Mul extends Expr{

	public Mul(Expr A, Expr B){
		super(A,B);
	}




	public int eval(){
		int returnValue=0;
		Expr first=super.getFirst();
		Expr second=super.getSecond();
			
		returnValue=first.eval()*second.eval();

		return returnValue;
	}//end of eval



}