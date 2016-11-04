package assignment06;

public class GraduateCourse extends Course{

	public GraduateCourse(String mystr){
		super(mystr);

	}

	public boolean isUndergrad(){
		return false;

	}

	public boolean isGrad(){
		return true;

	}


}