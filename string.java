import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc= new Scanner(System.in);
        System.out.println("entr the first string");
        s1 = sc.nextLine();
        System.out.println("enter the another string");
        s2 =sc.nextLine();

        if (s1.compareTo(s2)>0)
        System.out.println("s1 is greater");
        else if (s1.compareTo(s2)<0)
        System.out.println("s2 is greater");
        else
        System.out.println("both  the string are equal");
    }
}
