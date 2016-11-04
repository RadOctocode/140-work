package assignment06;
import java.util.Set;
import java.util.HashSet;

 public class GraduateStudent extends Student{
 	private String undergradMajor;

 	public GraduateStudent(String myMajor, String oldMajor){
 		super(myMajor);
 		undergradMajor=oldMajor;
 	}

 	public boolean isUndergrad(){
 		return false;

 	}

 	public boolean isGrad(){
 		return true;
 	}

 	public void adjustSchedule(){
 		Set<Course> mySchedule=super.getSchedule();
 		for (Course cour: mySchedule) {
 			Course currentCourse=cour;
 			int numofUnder=0;
 			boolean underGrad=currentCourse.isUndergrad();
 			if(underGrad==true){
 				numofUnder++;
 				if(numofUnder>1){
 					mySchedule.remove(currentCourse);

 				}
 			}
 		}//end of for

 	}

 	public boolean hasUndergradClass(){
 		boolean returnValue=false;
 		Set<Course> mySchedule=super.getSchedule();
 		for(Course cour:mySchedule){
 			if(cour.isUndergrad()==true){
 				returnValue=true;
 			}
 		}
 		return returnValue;
 	}

 	/**public static void main(String [ ] args){
 		GraduateStudent myGrad=new GraduateStudent("Math","English");
 		UndergradCourse course1= new UndergradCourse("CS120");
  		GraduateCourse course2= new GraduateCourse("CS224");
 		GraduateCourse course3= new GraduateCourse("CS225");
 		myGrad.addCourse(course1);
 		myGrad.addCourse(course2);
 		myGrad.addCourse(course3);
 		System.out.println(myGrad.hasUndergradClass());
 	}**/
 }//end of class