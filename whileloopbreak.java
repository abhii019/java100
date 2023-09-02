import java.util.Scanner;
public class whileloopbreak {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("enetre the number");
            n=sc.nextInt();
            if(n==5){
                break;
            }
            System.out.println("you enetre the no "+n);
        } 
    }
}
