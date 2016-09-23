package assignment03;
import java.lang.*;
import java.util.Arrays;

public class NameUtilities{

public static int countFirstCharacters(char ch, String[] names){
	int finalSum=0;
	ch=Character.toLowerCase(ch);
	if(names==null){return(-1);}
	else{
	for (int i=0; i< names.length; i++){
		String currentWord=names[i];
		currentWord=currentWord.toLowerCase(); 
		if (currentWord!=null){
		
			if(currentWord.charAt(0)==ch){
				finalSum=finalSum+1;
			}
		}

	}
	}
	return finalSum;	
}//end of countFirstCharacters


public static double averageLength(String[] names){
double finalAver=0;
	if(names==null){return(-1.0);}
	else{
	for (int i=0; i<names.length; i++){
		String currentWord=names[i];
		currentWord=currentWord.toLowerCase();  
		if (currentWord!=null){
		finalAver=finalAver+currentWord.length();
		}

		}
		finalAver=finalAver/names.length;
	}
	return (finalAver);
}//end of averageLength


public static int countSyllables(String text) {
	int count = 0;
	int end = text.length() - 1;
	if (end < 0) { 
		return 0; 
	} // The empty string has no syllables

	// An e at the end of the word doesn't count as a vowel
	char ch = text.charAt(end);
	if (ch == 'e' || ch == 'E') {
		end--; 
	}

	boolean insideVowelGroup = false;
	for (int i = 0; i <= end; i++) {
		ch = text.charAt(i);
		String vowels = "aeiouyAEIOUY";
		if (vowels.indexOf(ch) >= 0) {
			// ch is a vowel
			if (!insideVowelGroup) {
				// Start of new vowel group
				count++; 
				insideVowelGroup = true;
			}
		} else {
			insideVowelGroup = false;
		}
	}

	// Every word has at least one syllable
	if (count == 0) {
		count = 1;
	}

	return count;      
}//end of coutSyllables


public static double averageNumberOfSyllables(String[] names){
double returnValue=0;

for (String i: names){
returnValue= returnValue+countSyllables(i);

}//end of for loop
returnValue=returnValue/names.length;
return(returnValue);
}//end of averageNumberOfSyllables


}//end of NameOfUtilites