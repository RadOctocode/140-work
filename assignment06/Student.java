package assignment06;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Arrays;

public class Student{
	private static int nextID = 10001;
	private String name;
	private int id;
	private Set<Course> schedule;
	private String major;
	private ArrayList<Course> allCourses = new ArrayList<>();


	public Student(String maj){
		name=Question1.name(id);
		major=maj;
		schedule = new HashSet<>();
		id=nextID;
		nextID++;
	}


	protected Set<Course> getSchedule(){
		return schedule;

	}

	public boolean isUndergrad(){
		return false;

	}

	public boolean isGrad(){
		return false;

	}

	public void adjustSchedule() { 
	} 

	public void addCourse(Course myCourse){
 		schedule.add(myCourse);

 	}
 	public boolean hasCourse(int crn){
 		boolean returnValue=false;
 		for(Course cour: schedule){
 			int currentCRN=cour.getCRN();
 			if(currentCRN==crn){
 				returnValue=true;
 			}
 		}
 		return returnValue;
 	}

 	public ArrayList<Course> getAllCourses(){
 		return allCourses;
 	}

}//end of class