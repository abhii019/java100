import java.io.IOException;
import java.util.*;
public class notepad {
    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();
        try{
            rs.exec("notepad ");
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
