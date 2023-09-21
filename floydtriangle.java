import java.util.Scanner;
public class floydtriangle {
    public static void main(String[] args) {
        int n ,num =1,c,d;
        Scanner in = new Scanner (System.in);
        System.out.println(" Enter the number of rows of floyds traiangle you want");

        n = in.nextInt();

        System.out.println("Floyds traingle");
        for (c=1 ; c<=n ; c++)
        {
            for (d=1 ; d<=c; d++)
    {
        System.out.println(num+"");
        num++;
    }
    System.out.println();
        }
    }
}
