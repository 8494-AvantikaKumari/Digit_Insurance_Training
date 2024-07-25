 class rect1 {
    int length;
    int width;

    public rect1(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int area(){
        return length * width;
    }
    public int perimeter(){
        return 2*(length+width);
    }

}

public class rect{
    public static void main(String[] args){
        rect1 rectangle=new rect1(10,2);
        rect1 rectangle2=new rect1(20,2);
        System.out.println("area of 1st rectangle: "+ rectangle.area());
        System.out.println("perimeterof 1st rectangle:"+rectangle.perimeter());
        System.out.println("area of 2nd rectangle: "+ rectangle2.area());
        System.out.println("perimeterof 2nd rectangle:"+rectangle2.perimeter());
    }
}
