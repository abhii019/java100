import java.util.Scanner;
public class execptionhandling {
    public static void main(String[] args) {
        int a ,b ,result;

        System.out.println("enetr the teo integers");
        Scanner sc = new Scanner(System.in);
         a= sc.nextInt();
         b= sc.nextInt();

         try{
            result = a/b;
            System.out.println("the result is"+ result);

         }
         catch(ArithmeticException e){
            System.out.println("execption caught division by zero");

         }
    }
}
