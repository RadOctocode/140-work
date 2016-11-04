package assignment06;

public class LevelTwo extends LevelThree{

	public LevelTwo(double[] balances){
		super(balances);
	}

		public double measure(){
			double returnValue=super.measure();
			int lengthBal=super.getLength();
			returnValue=returnValue/lengthBal;
			return returnValue;
		}
}