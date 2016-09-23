 
package assignment03;
import java.lang.*;
import java.util.ArrayList;

public class FirstCharAnalyzer{
private char ch;
private ArrayList<String> list= new ArrayList<>();

public FirstCharAnalyzer(char charact, ArrayList<String> names){
 ch=charact;
 list=names;
}

public String toString() {
	String[] names = {};
	ch= Character.toLowerCase(ch);
	names = list.toArray(names); // "list" is the ArrayList field
	return "" + NameUtilities.countFirstCharacters(ch, names); // ch is the char field
}//end of toString;

}//end of finalCharAnalyzer 