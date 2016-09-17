package assignment01;

public class Employee {

	private Company company;
	private double salary;
	private Person person;

	public Employee(double aSalary,Person aPerson, Company aCompany){
		salary=aSalary;
		person=aPerson;
		company=aCompany;
		person.getHistory()[2] = this;
	}//end of constructor

	public double getSalary(){
		return salary;
	}//end of getSalary

	public Person getPerson(){
		return person;
	}//end of getPerson

	public Company getCompany(){
		return company;
	}//end of getCompany

	public void setSalary(double newSalary){
		salary=newSalary;
	}

}//end of hs-student