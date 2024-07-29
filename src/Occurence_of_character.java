public class Occurence_of_character {
    public static void main(String[] args){
        String str="avantika";
        char ch='a';

        int result=count(str,ch);
        System.out.println("occurrence of character "+ch+"is "+result+" times");
    }

    public static int count(String str, char ch){
        int count1=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count1++;
            }
        }
        return count1;
    }
}
