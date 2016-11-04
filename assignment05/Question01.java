package assignment05;
import java.util.*;

public class Question01{
	
public static boolean permutation1(String s1, String s2) {
	return Arrays.equals(counter(s1), counter(s2));

}//

public static int[] counter(String s){
	s = s.toLowerCase();
	int[] returnValue=new int[26];
	char[] letters={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	if(s!=null && s.length()>0){
		for(char ch : s.toCharArray()){
			if( ch >= 'a' && ch <= 'z'){
				for(int i=0; i<26;i++){
					if(ch==letters[i]){
						returnValue[i]++;
					}
				}//loop letters
			}//check id char is letter
		}//for char in string
	}//end of check
	return returnValue;
}//end of counter


public static int count(char c, String s){
	int returnValue=0;
	if(s!=null||s.length()>0){
		for (char ch : s.toCharArray()){
 			if(ch==c){
 				returnValue++;
 			}
		}
	}//end of check
return returnValue;
}//end of count



public static boolean permutation2(String s1, String s2){ 
	boolean returnValue=true;
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	for(char c = 'a'; c <= 'z'; c++){
		int count1=count(c, s1);
		int count2=count(c, s2);
		if(count1!=count2){
			returnValue=false;
		}

	}
return returnValue;
}//end of permutation2


public static boolean permutation3(String s1, String s2){
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	Map<Character, MyChCounter> counter1 = new TreeMap<>();
	Map<Character, MyChCounter> counter2 = new TreeMap<>();

	for (char c : s1.toCharArray()){
		if(Character.isLetter(c)){
			if(counter1.containsKey(c)){
				(counter1.get(c)).increment();

			}//end of contains key

		else{
			 counter1.put(c, new MyChCounter(c));
		}

		}//end of is letter
	}//end of for



	for (char c : s2.toCharArray()){
		if(Character.isLetter(c)){
			if(counter2.containsKey(c)){
				(counter2.get(c)).increment();
			}//end of contains key

		else{
			 counter2.put(c, new MyChCounter(c));
		}

		}//end of is letter
	}//end of for




	return counter1.equals(counter2);
}//end of permutation3

public static void main(String [] args){
 System.out.println(permutation1("Here's the cinema", "The Iceman's here"));
 System.out.println(permutation2("Here's the cinema", "The Iceman's here"));
 System.out.println(permutation3("Here's the cinema", "The Iceman's here"));
 System.out.println(permutation3("Here's the machine", "The Iceman's here"));
 System.out.println(permutation2("Here's the machine", "The Iceman's here"));
 System.out.println(permutation1("Here's the machine", "The Iceman's here"));




}//end of main

}//end of class

class MyChCounter {
    char c;
    int count = 1;
    MyChCounter(char c1) {
        c = c1;
    }
    void increment() {
        count++;
    }
    @Override
    public boolean equals(Object obj) {
        boolean retVal = false;
        if(obj != null && getClass() == obj.getClass()) {
            MyChCounter m = (MyChCounter)obj;
            retVal = (c == m.c && count == m.count);
        }
        return retVal;
    }        
    @Override
    public int hashCode() {
        return Character.hashCode(c)*31 + Integer.hashCode(count);
    }
}//end of MyChCounter