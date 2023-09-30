import java.util.Scanner;

 public class mutliplicationtable25{
    public static void main(String[] args) {
      int n,c;
      
      System.out.println("enter the number");
      Scanner sc = new Scanner(System.in);
      n=sc.nextInt();

      for (c=1;c<=10;c++){
        int m=(n*c);
        System.out.println(n+"*"+c+"="+(m));
      }
    }



}
