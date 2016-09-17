package assignment01;

public class University {

	private String name;
	private String city;

	public University(String aName, String aCity) {
		city=aCity;
		name=aName;
	}//end of constructor

	public String getName(){
		return name;
	}

	public String getCity(){
		return city;
	}

}//end of Unioversity