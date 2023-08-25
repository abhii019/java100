 import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        int a;
        float n;
        String s; 
        
        Scanner in = new Scanner (System.in);
       
System.out.println("enter the value of string"); 
       s= in.nextLine();
        System.out.println("the value of a is "+ s);

System.out.println("enter the value of integer"); 
      a= in.nextInt();
      System.out.println("the value of a is"+a);

      
System.out.println("enter the value of float"); 
      n= in.nextFloat();
      System.out.println("the value of n is"+
      n);
    }
}
