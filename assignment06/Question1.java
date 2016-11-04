package assignment06;
import java.lang.Math;

public class Question1 {

   public static String name(int n) {
      if (n >= 26*26*26*26*26*26) return "ZZZZZZ";
      char[] chs = Integer.toString(n, 26).toCharArray();
      char[] chs2 = new char[6];
      System.arraycopy(chs, 0, chs2, 6-chs.length, chs.length);
      for(int i = 0; i < 6; i++) {
         if(chs2[i] == 0) chs2[i] = 'A';
         if(chs2[i] >= '0' && chs2[i] <= '9') chs2[i] = (char)('A' + chs2[i]-'0');
         if(chs2[i] >= 'a' && chs2[i] <= 'p') chs2[i] = (char)('A' + 10 + chs2[i]-'a');
      }		
      return new String(chs2);
   }//end of name



   public static int nameToInt(String str){
      int returnValue=0;
      str=str.toUpperCase();
      int[] charPos= new int[6];
      char[] letters={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      
      if(str.length()==6 && str!=null){
         for(int k=0; k<str.length(); k++ ){
            char currentChar=str.charAt(k);
          for (int j=0; j<letters.length; j++){
               if(currentChar==letters[j] && currentChar!='A'){
                  charPos[k]=j;
               }
            }//end pof for j
         }//end of k

         for (int i=5; i>=0;i--){
            int currentPow=(int)Math.pow(26.0,i);
            int correctPos=Math.abs(i-5);
            returnValue=returnValue+(currentPow*charPos[correctPos]);

         }//end of for i
      }//end of check

      else{returnValue=-1;}

      return returnValue;
   }//end of name to int



   public static String next(String str){
      String returnValue="null";

      if(nameToInt(str)!=-1){
         returnValue=name(nameToInt(str)+1);
      }
      return returnValue;
   }//end of next


    public static String previous(String str){
      String returnValue="null";
         if(nameToInt(str)!=-1 && nameToInt(str)!=0){
            returnValue=name(nameToInt(str)-1);
         }
         return returnValue;
    }//end of previous



   public static void main(String[] args) {

      System.out.println(name((26*2)+1));//AAAABA
      System.out.println(name(26*26));//AAABAA
      System.out.println(nameToInt("AAAAAA"));
      System.out.println(next("AAAAAA"));//AAABAA
      System.out.println(previous("AAAAAA"));//AAABAA
      System.out.println(name(321272406));
      System.out.println(name(26*26*26*26*26*26 - 2));
      System.out.println(name(26*26*26*26*26*26 - 1));
      System.out.println(26*26*26*26*26*26); //308,915,776
   }//9.5.2 equals method
}//end of question1
