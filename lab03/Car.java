package lab03;

public class Car {

	private int mileage;
	private String model;

	public Car(int aMileage, String aModel){
		mileage=aMileage;
		model=aModel;

	}//end of constructor

	public int getMileage(){
		return mileage;
	}//end of getMileage

	public String getModel(){
		return model;
	}//end of getModel

	public boolean shouldSell(){
		int milesDriven=getMileage();
		if(milesDriven>100000){
			return true;
		}
		else{
			return false;
		}
	}//end of shouldSell

	public static void main(String[] args) {
		Car[] carArray={
			new Car(100001, "modelA"),
			new Car(1000, "modelB"),
			new Car(100555, "modelC"),
			new Car(100, "modelD")};

			int numberOfSoldCars=0;

		for (Car i: carArray){
			boolean sellbool=i.shouldSell();
			if(sellbool==true){
				numberOfSoldCars=numberOfSoldCars+1;
			}
		}//end of for loop

		System.out.println("Cars expected to sell "+2);
		System.out.println("Cars to sell "+ numberOfSoldCars);
	}//end of main
}//end of Car
