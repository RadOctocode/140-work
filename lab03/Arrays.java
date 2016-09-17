package lab03;

public class Arrays{

public static double average(int[] array) {
    double sum=0;
    double finalAverage=0;
    if(array==null || array.length==0){
		finalAverage= -1;
	}

    else{
    	for (int i: array){
    		sum=sum+i;
    }
    	finalAverage=sum/array.length;
	}//end of else
	return finalAverage;
}//end of average

public static double averageOfRange(int[] array, int lowerBound, int upperBound) {
    double sum=0;
    double finalAverage=0;
    int i;
     	if(array==null || array.length==0 || lowerBound >= upperBound){
			finalAverage= -1;
		}//end of if

		else{
			for(i=lowerBound; i<upperBound; i++){
				sum=sum+array[i];
			}//end of for loop
			finalAverage=sum/(i-1);
		}//end of else

	return finalAverage;
}//end of average

public static void main(String[] args){
	int[] nullArray= null;
	int[] emptyArray =new int[0];
	int[] oddArray= {1,3,5};
	int[] evenArray= {2,4,6,8,10,12};
	//end of intializing arrays
	
	System.out.println("-----------averages--------------");
	System.out.println("recieved "+ average(nullArray) + " expected: "+ "-1");
	System.out.println("recieved " + average(emptyArray)+" expected: "+ "-1");
	System.out.println("recieved "+ average(oddArray)+ " expected: "+ "3");
	System.out.println("recieved "+ average(evenArray)+ " expected: "+ "7");
	//end of testing average function
	System.out.println("--------------averages of ranges--------------");
	System.out.println("recieved "+ averageOfRange(evenArray,0,evenArray.length)+ " expected: "+ "7");
	System.out.println("recieved "+ averageOfRange(evenArray,1,4)+ " expected: "+ "6");
	System.out.println("recieved "+ averageOfRange(evenArray,4,4)+ " expected: "+ "-1");
	System.out.println("recieved "+ averageOfRange(evenArray,5,4)+ " expected: "+ "-1");
try{
//averageOfRange(evenArray,-1,4);
averageOfRange(oddArray,0,50);
}//end of try

catch(ArrayIndexOutOfBoundsException aioob){
System.out.println("the index is out of bounds");
aioob.printStackTrace();

}
catch(NullPointerException npe){
System.out.println("the value is null");
npe.printStackTrace();

}
}//end of main


}//end of Arrays