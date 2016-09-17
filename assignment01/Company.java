package assignment01;

public class Company {

	private String name;
	private String city;

	public Company(String aName, String aCity){
		name=aName;
		city=aCity;
	}//end of constructor

	public String getName(){
		return name;
	}//end of getName

	public String getCity(){
		return city;
	}//end of getCity

}//end of Company
