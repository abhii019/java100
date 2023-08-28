import java.util.*;
public class nested1 {
    public static void main(String[] args) {
        int a ,b;
        char grade;
        a=50;
        Scanner sc = new Scanner(System.in);
        b= sc.nextInt();
        if(a>b){
            if(b>90)
            grade='A';
            else if(b>80)
            grade='b';
        
            else 
            grade ='c';
            System.out.println("you have passed "+grade);
            
        }
        else{
            grade='f';
            System.out.println("you failed and ur grade is "+grade);
        }
    }
}
