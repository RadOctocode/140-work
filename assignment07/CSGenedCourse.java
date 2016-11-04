package assignment07;
import assignment06.UndergradCourse;

public class CSGenedCourse extends UndergradCourse {
	private CSGened[] geneds;

	public CSGenedCourse(CSGened[] myArray){
		geneds=myArray;
	}
// provide a constructor that has an arry as a paramter to set the field
// and a getter method for the array field
	public CSGened[] getGeneds(){
		return geneds;
	}
}