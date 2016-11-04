package assignment06;
import java.lang.*;

public class LevelThree extends LevelFour{
	private BankAccount[] arrayOfBank;

	public LevelThree(double[] balances){
		super(balances.length);
		if(balances!=null && balances.length>0){
			arrayOfBank=new BankAccount[balances.length];
			for(int i=0; i<balances.length; i++){
				arrayOfBank[i].deposit(balances[i]);
			}
		}
	}//constructor

	public double measure(){
		double returnValue=0;
		for(int i =0; i<arrayOfBank.length; i++){
			double currentBalance=arrayOfBank[i].getBalance();
			returnValue=returnValue+currentBalance;
		}
		return returnValue;
	}//measure

	public double distance(int i, double mean){
		double returnValue;
		double currentBalance=arrayOfBank[i].getBalance();
		returnValue=Math.abs(currentBalance-mean);
		return returnValue;
	}

	public int getLength(){
		return arrayOfBank.length;
	}

	public BankAccount[] getArray(){
		return arrayOfBank;
	}



}