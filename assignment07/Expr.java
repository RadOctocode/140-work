package assignment07;

public abstract class Expr{


	Expr first;
	Expr second;

	public Expr(Expr A, Expr B){
		first=A;
		second=B;
	}

	public Expr(){

	}
	
	public Expr getFirst(){
		return first;
	}

	public Expr getSecond(){
		return second;
	}

	abstract public int eval();
	

}