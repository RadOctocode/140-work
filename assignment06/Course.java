package assignment06;
import java.util.Set;
import java.util.HashSet;

public class Course{
	private static int nextCRN = 10001;
	private String title;
	private int crn;
	private Set<Student> enrollment;

	public Course(String str){
		crn=nextCRN;
		nextCRN++;
		enrollment = new HashSet<>();
		title=str;
	}//end of constructor

	public boolean isUndergrad(){
		throw new UnsupportedOperationException("No information about level of the course");
	}//end of undergrad;

	public boolean isGrad(){
		throw new UnsupportedOperationException("No information about level of the course");

	}//end of grad

	public int getCRN(){
		return crn;
	}

	public void tallyEnrollment(Student[] allStudents) {
		for (Student stu: allStudents){
			if(stu.hasCourse(crn)==true){
				enrollment.add(stu);
			}

		}
	}

	public int getEnrollmentSize(){
		return enrollment.size();
	}
	
}//end of class