package assignment07;

public class tempDriver{

	public static void main(String[] args){

		 System.out.println(new Add(new Num(5),new Num(5)).eval()+" equals 10");

		System.out.println(new Add(new Num(5),new Add(new Num(2), new Num(3))).eval()+" equals 10");

         System.out.println(new Add(new Add(new Num(1),new Add(new Num(10),new Num(1))),new Add(  new Add(new Add(new Num(3),new Num(3)),new Num(7))  ,new Num(1))).eval()+" equals 26");

         System.out.println(new Neg(new Num(0)).eval()+ " equals 1");


          Expr a = new Add(new Add(new Num(1),new Add(new Num(10),new Num(1))),new Add(new Add(new Add(new Num(3),new Num(3)),new Num(7)),new Num(1)));
        Expr b = new Mul(new Add(new Num(2),new Add(new Num(3),new Mul(new Num(2),new Num(3)))),new Mul(new Neg(new Num(0)),new Num(10)));
        Expr c = new Mul(new Neg(new Neg(new Num(1))),new Num(10));

        System.out.println("146 equals "+new Add(new Add(a,b),c).eval());
	}//end of main	
}