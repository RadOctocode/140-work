package assignment01;
import java.time.LocalDate;
public class Person {

	private String name;
	private LocalDate birthdate;
	Object[] history= new Object[3];

	 public Person(String aName, int day, int month, int year) {
    	name = aName;
    	birthdate = LocalDate.of(year, month, day);
	}//end of constructor

	public String getName(){
		return name;
	}//end of getName

	public LocalDate getBirthDate(){
		return birthdate;
	}//end of getBirthDate

	public Object[] getHistory(){
		return history;
	}//end of getHistory

public void printHistory() {
	System.out.println("History of " + name);
	if(history[0] != null) {
		// in the next line we "cast" history[0] to a HighSchoolStudent object
		HighSchoolStudent hss = (HighSchoolStudent)history[0];
		// in the next line the char '\t' provides a tab indent
		System.out.println("\tHigh school: " + hss.getHighschool().getName());
	}
	if(history[1] != null) {
		UniversityStudent us = (UniversityStudent)history[1];
		// in the next line the char '\t' provides a tab indent
		System.out.println("\tUniversity: " + us.getUniversity().getName() + " in " + us.getUniversity().getCity());
		}
	if(history[2] != null) {
		Employee e = (Employee)history[2];
		System.out.format("\tJob at %s in %s, with a salary of %.2f\n", 
			e.getCompany().getName(), e.getCompany().getCity(), e.getSalary());
	}
}


}//end of person