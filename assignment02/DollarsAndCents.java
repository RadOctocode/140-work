package assignment02;
/**
 * Class to manage money in dollars and cents
 * 
 * @author CS140
 */
public class DollarsAndCents {
	private long dollars;
	private int cents;
	
	public DollarsAndCents(long dlrs) {
		if (dlrs < 0) throw new IllegalArgumentException("argument cannot be negative");
		dollars = dlrs;
		cents = 0; // needed if cents is final		
	}

	/**
	  Constructor that initializes the cents field to the given amount, or the 
	  dollars and cents if the number of cents is one dollar or more.
	  @param cts The amount of the cents in the new account. The parameter 
	  must be an int. If a long is provided a different constructor is 
	  called
	  @throws IllegalArgumentException if the parameter is negative
	 */
	public DollarsAndCents(int cts) {
// this one is done for you. Note that if we called new DollarsAndCents(456), 
// dollars would he 4 and cents would be 56 (cents cannot exceed 99)
		if (cts < 0) throw new IllegalArgumentException("argument cannot be negative");
		dollars = cts/100;
		cents = cts%100;
	}//end of constructor 1
	
	/**
	  Constructor that initializes both the dollars and the cents field to 
	  the given amounts. The cents are adjusted to be less than one dollar.
	  @param dlrs The amount of dollars in the new account.  
	  @param cts The amount of the cents in the new account. if the number of 
	  cents exceeds a dollar, the excess dollars are added to the dollars field
	  and only the cents less than one dollar remain.
	  @throws IllegalArgumentException if either of the parameters is negative
	 */
	public DollarsAndCents(long dlrs, int cts) {
// use the ideas from the previous constructors to see how to do this
		if (cts < 0 || dlrs <0) throw new IllegalArgumentException("argument cannot be negative (constructor)");//exception thrower
		if(cts>100){
			dollars=dlrs+(cts/100);
			cents=cts%100;

		}//end of if
		else{
			dollars=dlrs;
			cents=cts;
		}//end of else

	}//end of constructor w dollars
	
	/**
	  A copy constructor that makes a new object with the same dollars and
	  cents values of the parameter
	  @param dc an object that provides the initial values of the fields
	  of the new object.
	 */
	public DollarsAndCents(DollarsAndCents dc) {
		dollars=dc.dollars;
		cents=dc.cents;
	}//end of copy
	
	/**
	  A no argument constructor that creates an object with both fields zero.
	 */
	public DollarsAndCents() {
		dollars=0;
		cents=0;

	}//end of empty
	/**
	  Return a new object with the dollars and cents that are the sum of
	  the fields the receiver and all the parameters. If the amount of cents exceeds 
	  one dollar the excess is passed to the dollars field. 
	  @param dcs a list of zero or more DollarsAndCents objects
	  @return a DollarsAndCents object with the sum of all the dollars and
	  cents in the receiver and the parameters. 
	 */
	public DollarsAndCents add(DollarsAndCents... dcs) {
// 	note you treat dcs as an array
// 	the cents in the return value must be less than 100
		int totalCents=cents;
		long totalDollars=dollars;
		for (int i=0; i<dcs.length; i++){
			totalCents=dcs[i].cents+totalCents;
			totalDollars=dcs[i].dollars+totalDollars;
		}//end of for
		totalDollars=totalDollars+totalCents/100;
		totalCents=totalCents%100;
		DollarsAndCents newAccount= new DollarsAndCents(totalDollars,totalCents);
		return newAccount;
	}//end of add
	
//BY THE WAY, the following method suggests we should define an equals method but
//we will do this when we have a chance to talk about the hashCode method
	/**
	  Tests if this object is less than the parameter. Consider the
	  dollars and cents as money and test if this amount is less than
	  the parameter's amount
	  @param dc a DollarsAndCents object to be compared with this object
	  @return true if this object is less than the other object in 
	  terms of dollars and cents, otherwise false
	 */
	public boolean lessThan(DollarsAndCents dc) {
// if dollars is less than dc.dollars the return value is true
// if dollars is equal to dc.dollars then if cents is less
// than dc.cents the return value is true
// otherwise the return value is false
		if(dollars<dc.dollars){
			return true;
		}
		else if(dollars==dc.dollars && cents<dc.cents){
			return true;
		}
		else{
			return false;
		}
	}//end of less than
	
	/**
	  This could produce negative money, so an exception is thrown if the resulting
	  fields would be negative. Otherwise a new DollarsAndCents object is
	  returned with the parameter's dollars and cents values subtracted
	  from the receiver's fields 
	  @param dc a DollarsAndCents object with values that are subtracted
	  from the receiver to produce the new object
	  @return a DollarsAndCents object with fields that are the difference between
	  the receiver and the parameter
	  @throws IllegalArgumentException if the parameter is not less than
	  this object or has fields that are equal to this object 
	 */
	public DollarsAndCents subtract(DollarsAndCents dc) {
		DollarsAndCents	returnValue=null;
		long dlrs=0;
		int cts=0;
		if (dollars!=dc.dollars || cents!=dc.cents){ 
			if(!dc.lessThan(this)){
				throw new IllegalArgumentException("argument cannot be negative");//exception thrower
			}
		}

		dlrs=dollars-dc.dollars;
		cts=cents-dc.cents;
		while(cts<0){
			dlrs=dlrs-1;
			cts=cts+100;
		}
		
		returnValue=new DollarsAndCents(dlrs,cts);
		return returnValue;
// NEW:-
// declare a DollarsAndCents return value initially null
// if either of dollars and dc.dollars or cents and dc.cents are different then
// throw an exception if(!dc.lessThan(this)) -- this means dc is not lessThan 
// this object. Continue by defining local variables dlrs and cts equal to
// dollars - dc.dollars and cents - dc.cents, respectively
// adjust dlrs and cts to make cts positive if necessary.
// the return value is set to a new object with arguments dlrs and cts
// else is a new object with its fields equal to 0.
 	}//end of subtract

	/**
	  Returns a new object that based on the receiver's dollars and cents 
	  modifies by a positive factor.
	  @param factor the multiplying factor for the new object 
	  @return a new object with fields that are the receiver's fields
	  modified by the factor 
	  @throws IllegalArgumentException if the factor is zero
	 */
	public DollarsAndCents upOrDown(double factor) {
	long d=dollars;
	int c=cents;
	long finalD;
	int finalC;
// This computation must be done with doubles
	double temp = (d+c/100.0)*factor;
// the return value will have (long)temp for dollars and
	finalC=(int)Math.round((temp - (long)temp)*100);
	finalD=(long) temp;
// (int)Math.round((temp - (long)temp)*100) for cents;
	DollarsAndCents returnVal= new DollarsAndCents(finalD,finalC);
	return returnVal;
	}
	
	@Override
	public String toString() {
		// this is a method overridden from class Object
		return String.format("$%d.%02d", dollars, cents);
	}	
}