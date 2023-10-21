import java.util.Scanner;
public class largeno {
    public static void main(String[] args) {
        int x,y,z;
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the numbers");
          x=sc.nextInt();
          y=sc.nextInt();
          z=sc.nextInt();
          if(x>y&&x>z)
          System.out.println("x is the largest");
          else if(y>z&& y>x)
 System.out.println("y is the largest");
          else if(z>x&&z>y)
          System.out.println("z is the largest");
          else
          System.out.println("the no are not  distinct");
    }
}
