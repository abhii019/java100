
import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        a=sc.nextInt();
        if(a%2==0)
        {
            System.out.println("the no ids even");
        }
        else
        {
            System.out.println("the no is odd");
        }
    }
}
