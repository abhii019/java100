import java.util.Scanner;

public class swap2 {
    public static void main(String[] args) {
        int x,y;
        System.out.println("eneter the values of x and y");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        y=sc.nextInt();
         
        System.out.println("the values before swapping x is"+x+ "and yis"+y);
        System.out.println("the values before swapping x is"+x+ "and yis"+y);

        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("the calur after swap is xis"+x+ "y"+y);
    }
}
