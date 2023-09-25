import java.util.Scanner;
public class palindrome1 {
    public static void main(String[] args) {
        String original , reverse ="";
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter the string to check it is palindrome or not");
        original = sc.nextLine();
   
       int length = original.length(); 

       for (int i =length -1 ; i>=0; i--)
       reverse  = reverse +original.charAt(i);

       if (original.equals(reverse))
       System.out.println("entered string is palindrome ");
       else 
       System.out.println("entered string in not palindrome");
    }
}
