package assignment02;
import java.util.Arrays;

public class testDriverDollarsAndCents{
public static void main(String[] args){
   DollarsAndCents test1=new DollarsAndCents(100,50);
   DollarsAndCents test2=new DollarsAndCents(3,100);
   DollarsAndCents test3=new DollarsAndCents();
   System.out.println(test1.add(test2));
   System.out.println(test1.lessThan(test2));
   System.out.println(3-2);
   System.out.println(test1.subtract(test2));
   System.out.println(test2.upOrDown(0.5));


}//end of main
}