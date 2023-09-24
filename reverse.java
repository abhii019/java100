import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthSpinnerUI; 
public class reverse {
    public static void main(String[] args) {
           int n , reverse =0;

    System.out.println("enter the no to be reverssse");
    Scanner in = new Scanner(System.in);
    n= in.nextInt();
while(n!=0){
    reverse = reverse*10;
    reverse = reverse + n%10;
    n=n/10;
}
System.out.println("reveerse of the enterder no is"+reverse);
}
 
}
