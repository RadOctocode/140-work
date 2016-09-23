 
package assignment03;
import java.util.ArrayList;



public class SyllablesAverageAnalyzer{
private ArrayList<String> list= new ArrayList<>();

public SyllablesAverageAnalyzer(ArrayList<String> names){
 list=names;
}

public String toString() {
	String[] names = {};
	names = list.toArray(names); // "list" is the ArrayList field
	return "" + NameUtilities.averageNumberOfSyllables(names);
}//end of toString;

}//end of finalCharAnalyzer 