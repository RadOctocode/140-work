package assignment07;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.io.PrintWriter;
import java.io.File;

import assignment06.Course;
import assignment06.Student;

 public class UndergradStudent extends Student{


 	public boolean isUndergrad(){
 		return true;

 	}


 	public boolean isGrad(){
 		return false;
 	}


	public boolean satisfiesCSGened(){
		try (PrintWriter out = new PrintWriter("test.log")) {
			ArrayList<Set<CSGened>> waysToSatisfy= new ArrayList<>();
			waysToSatisfy.add(new HashSet<CSGened>());
			boolean Csatisfied=false;
			boolean Osatisfied=false;
			boolean F1satisfied=false;

			for(Course crs : getAllCourses()){
				if(crs instanceof CSGenedCourse){
					((CSGenedCourse)crs).getGeneds();
					CSGenedCourse gecrs = (CSGenedCourse)crs;
					System.out.println(Arrays.toString(gecrs.getGeneds()));
					int sz=waysToSatisfy.size();
					int len=gecrs.getGeneds().length;
					

					if(len>1){
						for(CSGened csCour: gecrs.getGeneds){
							for(int i = 0; i < len-1; i ++) { 
								for(int j = 0; j < sz; j++) {
									Set<CSGened> courseList = new HashSet<CSGened>();
									courseList.addAll(waysToSatisfy.get(j));
									waysToSatisfy.add(courseList);
								}//end of j
							}//end of i



						}//for each CSgened
					}//end of if len
				}//end of instance of
			}//end of for
		//less than or equalto minus one

       out.close();
	} catch (FileNotFoundException e) {
       e.printStackTrace();
	} 
	return false;
		
	}//end of stisfiesCS

 }//end of class