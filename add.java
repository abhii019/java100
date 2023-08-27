import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input = new Scanner (System.in);
        System.out.println("enter first two njumber");
        x=input.nextInt();
        y=input.nextInt();
        z=x+y;
        System.out.println("the addituon of two number is"+z);
    }
}

