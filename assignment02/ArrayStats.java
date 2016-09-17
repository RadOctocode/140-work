package assignment02;

public class ArrayStats{

private double[] arrayDouble = null;
private double averageOfElements = 0D;//average
private double maximumElement = 0D;//max
private double minimumElement = 0D;//min
private int indexOfMax = -1;//index of max
private int indexOfMin = -1;//index of min

//if array field is null doubles=0 int=-1
public ArrayStats(double... vals){
	int counter=0;

	if(vals!=null && vals.length !=0){
	arrayDouble=new double[vals.length];
	maximumElement=vals[0];//comparison value
	minimumElement=vals[0];//comparison value
	averageOfElements=0;

	for (int i=0; i<vals.length; i++){
			arrayDouble[counter]=vals[i];
			counter++;
			averageOfElements=averageOfElements+vals[i];

		if(vals[i]>maximumElement){
			maximumElement=vals[i];
			indexOfMax=i;
		}//end of if for max

		if(vals[i]<minimumElement){
			minimumElement=vals[i];
			indexOfMin=i;
		}//end of if for max

	}//end of for
	averageOfElements=averageOfElements/vals.length;
}//end of if

}//end of consrtuctor

public double[] getData(){
	return arrayDouble;
}//end of getData

public double getMax(){
	return maximumElement;
}//end of getMax

public double getMin(){
	return minimumElement;
}//end of getMin

public int getMaxIdx(){
	return indexOfMax;
}//end of getMaxIdx

public int getMinIdx(){
	return indexOfMin;
}//end of getMinIdx

public double getAvg(){
	return averageOfElements;
}
}//end of ArrayStats