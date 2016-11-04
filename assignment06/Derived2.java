package assignment06;

public class Derived2 extends BaseClass{
	private String field2;

	public Derived2(String myfield, String afield){
		super(myfield);
		field2=afield;
	}

	public String toString(){
		return super.toString()+" "+field2;
	}
}