package assignment06;

public class UndergradCourse extends Course{

	public UndergradCourse(String mystr){
		super(mystr);

	}

	public boolean isUndergrad(){
		return true;

	}

	public boolean isGrad(){
		return false;

	}


}