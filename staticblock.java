// public class staticblock {
//     public static void main(String[] args) {
//         System.out.println("main method id executed ");

//     }
//     static{
//         System.out.println("Stsic block is executed before main method");
//     }
// }
class staticblock {
public static void main(String[] args) {
System.out.println("You are using Windows_NT operating system.");
}
static {
String os = System.getenv("OS");
if (os.equals("Windows_NT") != true) {
System.exit(1);
}
}
}