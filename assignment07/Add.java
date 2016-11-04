package assignment07;

public class Add extends Expr{


	public Add(Expr A, Expr B){
		super(A,B);
	}




	public int eval(){
		int returnValue=0;
		Expr first=super.getFirst();
		Expr second=super.getSecond();
			
		returnValue=first.eval()+second.eval();

		return returnValue;
	}//end of eval

}//end of class