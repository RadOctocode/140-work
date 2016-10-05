package assignment04;
import java.util.ArrayList;


public class VariousMethods{

	

public static int oddEvenCount(long[] arr){
	int evenCount=0;

	if(arr != null && arr.length>1){

		for (int i=0; i<arr.length; i++){

			if(i%2==1){	
				if(arr[i]%2==0){
					evenCount++;
				}//check if the element is even
			}//check if index is odd
		}//end of for
	}//end of checking if array is null or empty

	if(arr==null){
		evenCount=-1;
	}//end of if array is null
	return evenCount;
}//end of oddeven count




public static int minCount(double min, ArrayList<BankAccount> list){
int returnValue=0;
if(list!=null && list.size()>0){
for (int i=0; i<list.size();i++){
	BankAccount currentAccount=list.get(i);
	double currentBalance=currentAccount.getBalance();
		if(currentBalance>min){
			returnValue++;
		}
}//end of for
}//end of if
else{returnValue=-1;};
return returnValue;
}//end of minCount




public static double justAnExercise(double cap, char initial, BankAccount[] arr){

double returnvalue=-1.0;
	if (arr!=null && arr.length>0 ){

		for(int i=0; i<arr.length; i++){
			if(arr[i]!=null){
			double currentBalance=arr[i].getBalance();
			int currentId=arr[i].getID();
			Person currentPerson=arr[i].getCustomer();
			String currentName=currentPerson.getName();
			String lowerName=currentName.toLowerCase();
			char lowerInit=Character.toLowerCase(initial);

			if(i%3==0 && currentBalance<cap){
				returnvalue=currentBalance;
			}
			if(i%3==1 && currentId%2==0){
				returnvalue=currentBalance;
			}

			if(i%3==2 && lowerName.charAt(0)==lowerInit){
				returnvalue=currentBalance;
			}
			}//end of if

		}//end of for loop	

	}//end of if statement

return returnvalue;
}//end of function





 public static int anotherExercise(ArrayList<BankAccount> list) {
 	int returnValue=-1;
 	String largestName="";
 	if(list!=null && list.size()>0){
 		for(int i=0; i<list.size(); i++){
 			BankAccount currentPosition=list.get(i);
 			if(currentPosition!=null){
 				Person currentPerson=currentPosition.getCustomer();
				String currentName=currentPerson.getName();
				if(currentName.length()>=largestName.length()){
					largestName=currentName;
					returnValue=i;
				}
 			}

 		}//end of for
 	}//end of if 
 	return returnValue;
 }//end of function





}//end of class