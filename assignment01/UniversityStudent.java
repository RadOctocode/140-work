package assignment01;

public class UniversityStudent{

	private University university;
	private Person person;
	
	public UniversityStudent(University aUniversity, Person aPerson) {
    	university=aUniversity;
    	person=aPerson;
    	person.getHistory()[1] = this;
	}//end of constructor

	public University getUniversity(){
		return university;
	}//end of getUni

	public Person getPerson(){
		return person;
	}//end of getPerson

	public Employee getAJob(Company comp, double startingSalary){
		return new Employee(startingSalary,person,comp);
	}//end of getAJob

}//end of U-student