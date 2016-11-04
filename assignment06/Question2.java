package assignment06;
import java.util.*;

public class Question2 {
        public static Course[] courseArray=new Course[600];
        public static Student[] studentArray= new Student[6000];
        public static Random rand= new Random();
    static {
    
    	for (int i=0; i<400;i++){
    		UndergradCourse newCourse= new UndergradCourse(Question1.name(rand.nextInt(308915776)));
    		courseArray[i]=newCourse;
    	}

    	for(int j=0; j<200; j++){
    		GraduateCourse newCourse= new GraduateCourse(Question1.name(rand.nextInt(308915776)));
    		courseArray[j+400]=newCourse;
    	}

    	for(int k=0; k<1000; k++){
    		GraduateStudent newStudent= new GraduateStudent(Question1.name(rand.nextInt(308915776)),Question1.name(rand.nextInt(308915776)));
            studentArray[k]=newStudent;
    	}

    	for(int l=0; l<5000; l++){
    		UndergradStudent newStudent= new UndergradStudent(Question1.name(rand.nextInt(308915776)));
            studentArray[l+1000]=newStudent;
    	}

        ArrayList<Course> list = new ArrayList<Course>(Arrays.asList(courseArray));
        Collections.shuffle(list);
        courseArray = list.toArray(courseArray);

        ArrayList<Student> list2 = new ArrayList<Student>(Arrays.asList(studentArray));
        Collections.shuffle(list2);
        studentArray = list2.toArray(studentArray);

        for (int m=0; m<studentArray.length; m++){
            Student currentStudent=studentArray[m];
            for(int n=0; n<4; n++){
                int rng= new Random().nextInt(courseArray.length);
                currentStudent.addCourse(courseArray[rng]);
            }

        }
    }//end of static

    public static void main(String [ ] args){
        int largestEnrol=0;
        int smallestEnrol=courseArray[0].getEnrollmentSize();
        int averageEnrol=0;
        float counter=0;
        for(int i=0; i<courseArray.length; i++){
            Course currentCourse=courseArray[i];
            currentCourse.tallyEnrollment(studentArray);
            int currentEnrolSize=currentCourse.getEnrollmentSize();
            if(currentEnrolSize>largestEnrol){
                largestEnrol=currentEnrolSize;
            }
            if(currentEnrolSize<smallestEnrol||smallestEnrol==0){
                smallestEnrol=currentEnrolSize;
            }
            averageEnrol=averageEnrol+currentEnrolSize;
        }
        for(int j=0; j<studentArray.length; j++){
            Student currentStudent=studentArray[j];
            if(currentStudent.isGrad()){
                ((GraduateStudent)currentStudent).adjustSchedule();
                if(((GraduateStudent)currentStudent).hasUndergradClass()){

                    counter++;

                }
            }
        }
        counter=(counter/1000)*100;
        averageEnrol=averageEnrol/courseArray.length;
        System.out.println(largestEnrol);
        System.out.println(smallestEnrol);
        System.out.println(averageEnrol);
        System.out.println(counter);
    }//end of main
}