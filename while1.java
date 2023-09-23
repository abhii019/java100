import java.util.Scanner;

import javax.swing.plaf.synth.SynthCheckBoxMenuItemUI;
public class while1 {
    public static void main(String[] args) {
        int n;
Scanner input =new Scanner(System.in);
        System.out.println("iinput an integer");

        while((n=input.nextInt()) !=0){
            System.out.println("you entered"+n);
            System.out.println("Input an integer");
        }
        System.out.println("out of loop");
    }
}
