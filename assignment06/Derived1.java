package assignment06;

public class Derived1 extends BaseClass{
	private String field1;

	public Derived1(String myfield, String afield){
		super(myfield);
		field1=afield;
	}
	public String toString(){
		return super.toString()+" "+field1;
	}
	
}