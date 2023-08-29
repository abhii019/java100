import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int a,b,fact=1;
        System.out.println("Enter an integer to calculate it's factorial");
        Scanner sc = new Scanner (System.in);
        a=sc.nextInt();
        if (a<0){
            System.out.println("tht no is negative");
        }
        else{
            for( b=1;b<=a;b++)
            fact=fact*b;
            System.out.println("the factorial is"+a+"is"+fact);
        }
    }
}
