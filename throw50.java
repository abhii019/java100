public class throw50 {
    static void validate(int age){
        if (age<18)
        throw new ArithmeticException ("not valid");
        else
        System.out.println("welcome to vote");
    }
    public static void main(String[] args) {
        validate(78);
        System.out.println("rest of the codee"); 
    }
}
