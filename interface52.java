
interface Info{
    static final String language ="Java";
    public void display();
}
public class interface52  implements Info{
    public static void main(String[] args) {
        interface52 obj = new interface52();
        obj.display();
    }

public void display(){
    System.out.println( language + "is awesome");
}
}