import java.util.Scanner;
public class farenheittocelsius {
    public static void main(String[] args) {
        float temperature;
              Scanner sc =new Scanner(System.in);
        System.out.println("enter the vlaue of temperature ");
          temperature =sc.nextInt();
          temperature=((temperature-32)*5)/9;
          System.out.println(temperature);
    }
}
