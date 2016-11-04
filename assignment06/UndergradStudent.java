 package assignment06;
 import java.util.Set;
import java.util.HashSet;

 public class UndergradStudent extends Student{

 	public UndergradStudent(String myMajor){
 		super(myMajor);
 	}

 	public boolean isUndergrad(){
 		return true;

 	}


 	public boolean isGrad(){
 		return false;
 	}

 	public void adjustSchedule(){
 		Set<Course> mySchedule=super.getSchedule();
 		for (Course cour: mySchedule) {
 			Course currentCourse=cour;
 			int numofGrad=0;
 			boolean grad=currentCourse.isGrad();
 			if(grad==true){
 				numofGrad++;
 				if(numofGrad>2){
 					mySchedule.remove(currentCourse);

 				}

 			}
 		}

 	}

 	

 }//end of class