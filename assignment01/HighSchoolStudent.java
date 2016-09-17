package assignment01;

public class HighSchoolStudent {

	private HighSchool highSchool;
	private Person person;

	public HighSchoolStudent(HighSchool aHighSchool, Person aPerson){
    	person=aPerson;
    	highSchool=aHighSchool;
    	person.getHistory()[0] = this;
	}//end of constructor

	public HighSchool getHighschool(){
		return highSchool;
	}//end of getHighschool

	public Person getPerson(){
		return person;
	}//end of getPerson

	public UniversityStudent goToUniversity(University univ){
		return new UniversityStudent(univ, person);
	}

}//end of hs-student
