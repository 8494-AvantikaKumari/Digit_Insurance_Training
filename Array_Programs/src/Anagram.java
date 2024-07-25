import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
       String str1="listen";
       String str2="silent";

      str1= str1.toLowerCase();
      str2= str2.toLowerCase();

      if(str1.length()==str2.length()){

       char[] char_array1=str1.toCharArray();
       char[] char_array2=str2.toCharArray();

          Arrays.sort(char_array1);
          Arrays.sort(char_array2);

          boolean result=Arrays.equals(char_array1,char_array2);
          if(result){
              System.out.println(str1+"and "+str2+" are anagram");
          }else{
              System.out.println(str1+"and "+str2+" are not anagram");
          }
    }else {
          System.out.println(str1+"and "+str2+" are not anagram");
      }
}
}
