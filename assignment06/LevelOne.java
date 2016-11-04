package assignment06;

public class LevelOne extends LevelTwo{
	public LevelOne(double[] balances){
		super(balances);
	}

	public double measure(){
		double returnValue=0.0;
		double averageOfGroup=super.measure();
		BankAccount[] myArray=super.getArray();
		for(int i=0; i<myArray.length; i++)
		{
			double currentDistance=super.distance(i,averageOfGroup);
			if(currentDistance>returnValue){
				returnValue=currentDistance;
			}
		}
		return returnValue;
	}

}