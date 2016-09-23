 
package assignment03;
import java.util.Arrays;
import java.util.ArrayList;

public class testDriver{
public static void main(String[] args){

ArrayList<String> names= new ArrayList<>();
ArrayList<Object> test=new ArrayList<>();
for (int i=0; i<1000; i++){

String currentName=resources.NamesResource.getRandomFirstName();
names.add(currentName);
}//end of for loop i

test.add(new SyllablesAverageAnalyzer(names)); 
test.add(new LengthAverageAnalyzer(names)); 
test.add(new FirstCharAnalyzer('a' ,names)); 

for(int x=0; x<test.size(); x++){
System.out.println(test.get(x));
}//end of for loopx


}
}//end of Maindriver
//Wolfe chapter 7, double-entry journal for Wolfe; stream reading, double-entry journal for stream reading; draft data sheet reviewed by instructor
//slide 5-8