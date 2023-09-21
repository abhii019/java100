import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;
public class armstrong1 {
    public static void main(String[] args) {
        int n,sum=0, temp,remainder,digits=0;
        Scanner in= new Scanner (System.in);
        System.out.println("input a number to check it is armstrong or not");
        n=in.nextInt();
        temp =n;
        while(temp!=0){
            digits++;
            temp =temp/10;
        }
        temp =n;

        while (temp !=0){
            remainder = temp%10;
            sum =sum + power(remainder,digits);
            temp =temp/10;
        }
        if (n==sum)
        System.out.println(n+ "is an armstrong number");
        else
        System.out.println(n+"is not an armstrong no");

    }
    static int power (int n ,int r){
        int c ,p =1;
        for (c=1 ; c<=r ; c++)
        p=p*n;
        return p;
    }
}
