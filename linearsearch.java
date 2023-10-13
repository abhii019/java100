import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class linearsearch {
    public static void main(String[] args) {
     int c, n, search ,array[];

    Scanner sc = new Scanner(System.in);
    n= sc.nextInt();
    array=new int[n];
    System.out.println("Enter"+n+"integer s");
    for (c=0;c<n;c++)
    array[ c]= sc.nextInt();

    System.out.println("enterr value to be find");
    search = sc.nextInt();
    for (c=0;c<n;c++)
    {
        if (array[c]==search)
        {
            System.out.println(search +"is present at location"+(c+1)+".");
            break;
        }
        if (c==n)
        System.out.println(search+"is not present in array");
    }
    }
}
