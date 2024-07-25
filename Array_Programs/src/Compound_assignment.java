public class Compound_assignment {
    public static void main(String[] args){
        int a=1;
        int b=2;
        int c=3;
        b+=c;
        System.out.println(b);
        c-=a;
        System.out.println(c);

        b*=a;
        System.out.println(b);
        b/=a;
        System.out.println(b);
        a%=c;
        System.out.println(a);

    }
}
