import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
public class mutliplyforanyno {
    public static void main(String[] args) {
            int a,b,c,d;
            System.out.println("entre the range of numbers to print the multiplication table");
            Scanner sc=new Scanner(System.in);

            a=sc.nextInt();
            b=sc.nextInt();
            for (c=a;c<=b;c++){
                System.out.println("multiplocation of tabkle of "+c);

            }
            for (d=1;d<=10;d++){
                System.out.println(c+"*"+d+"="+c*d);
            }
    }


}
