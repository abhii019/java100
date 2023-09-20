import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        int n, status =1, num =3;

        Scanner in = new Scanner(System.in);
        System.out.println("enetr the numbers of prime no u want");
        n= in.nextInt();
        if (n>=1){
            System.out.println("first" +n+"prime  numnbersss are:");
            System.out.println(2);
        }
        for (int count =2; count<=n; ){
             for (int j=2 ; j<=Math.sqrt(num);j++)
             {
                if (num%j==0){
            status=0;
            break;
                }
             }
             if(status !=0)
             {
                System.out.println(num);
                count++;
             }
        }
    }

}
