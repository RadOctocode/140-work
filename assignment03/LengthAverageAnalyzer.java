 
package assignment03;
import java.util.ArrayList;

public class LengthAverageAnalyzer{
private ArrayList<String> list= new ArrayList<>();

public LengthAverageAnalyzer(ArrayList<String> names){
	 list=names;
}

public String toString() {
	String[] names = {};
	names = list.toArray(names); // "list" is the ArrayList field
	return "" +NameUtilities.averageLength(names);
}//end of toNum;

}//end of finalCharAnalyzer 