package assignment04;
import java.util.ArrayList;



public class TestDriver{

public static void main(String [] args){


VariousMethods tester= new VariousMethods();
long[] test1={1,5,6,4,6,6,7,8,9};
long[] test2=null;
long[] test3={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
long[] test4=new long[1];
long[] test5=new long[0];
System.out.println("expect 3: "+tester.oddEvenCount(test1)); //expect 3
System.out.println("expect -1: "+tester.oddEvenCount(test2)); //expect-1
System.out.println("expect 8: "+tester.oddEvenCount(test3)); //expect 8
System.out.println("expect 0: "+tester.oddEvenCount(test4)); //expect 8
System.out.println("expect 0: "+tester.oddEvenCount(test5)); //expect 8


ArrayList<BankAccount> testBank=new ArrayList<>();
ArrayList<BankAccount> emptyBank=new ArrayList<>();
ArrayList<BankAccount> nullBank=null;
for (int i=0; i<11;i++){
	testBank.add(new BankAccount(i+100));
}//end of for loop

testBank.add(new BankAccount(20));

System.out.println("expect 10: "+tester.minCount(100.0, testBank));//expect 10
System.out.println("expect -1: "+tester.minCount(100.0, emptyBank));//expect -1
System.out.println("expect -1: "+tester.minCount(100.0, nullBank));//expect -1

String[] names={"Sharon","Bob","Alice","Terry","Rosa","Elton","Carrie","Shelly","Danny","Brandon","Alfred","Robin"};
for (int x=0; x<testBank.size();x++){
String currentName=names[x];
Person currentPerson= new Person(currentName,3,2,2001);
BankAccount currentBankAccount=testBank.get(x);
currentBankAccount.setCustomer(currentPerson);
}//loop through array list

System.out.println("expect 9: "+tester.anotherExercise(testBank)); //expect random number
System.out.println("expect -1: "+tester.anotherExercise(emptyBank)); //expect -1
System.out.println("expect -1: "+tester.anotherExercise(nullBank)); //expect -1

BankAccount[] arrayOfAccounts= testBank.toArray(new BankAccount[testBank.size()]);
BankAccount[] arrayOfnull=null;
BankAccount[] emptyArray=new BankAccount[12];

System.out.println("expect 107.0: "+tester.justAnExercise(100.0,'A',arrayOfAccounts)); //expect random number
System.out.println("expect -1.0: "+tester.justAnExercise(100.0,'A',arrayOfnull)); //-1.0
System.out.println("expect -1.0: "+tester.justAnExercise(100.0,'A',emptyArray)); //-1.0


}//end of main




}//end of testdriver