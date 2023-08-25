import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class swap {
    public static void main(String[] args) {
      
        int x,y, temp;
        System.out.println("enter the vakue if x and y");
        Scanner sc = new Scanner(System.in);

        x= sc.nextInt();
        y=sc.nextInt();

        System.out.println("before swapping x="+x+"y="+y);
        temp=x;
        x=y;
        y=temp;

        System.out.println("the vlaue after swap x="+x+  "y="+y);
    }

}
