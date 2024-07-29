public class Searching_of_String {
   public static void main(String[] args){
       String[] arr={"apple","mango","banana","grapes"};
       String target="banana";

       int result=search(arr,target);

       //System.out.println(result);

       if(result!=-1){
           System.out.println("string found in index:"+result);
       }else{
           System.out.println("string not found");
       }
   }
   public static int search(String[] arr, String target){
       for (int i = 0; i < arr.length; i++) {
           if(arr[i].equals(target)){
               return i;
           }
       }
       return -1;
   }
}
