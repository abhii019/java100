
import java.io.*;
import java.net.*;
public class getip{
    public static void main(String[] args) {
        try{
           
              InetAddress ip =  InetAddress.getByName("wwww.google.com");
             System.out.println(ip.getHostName());
             System.out.println(ip.getHostAddress());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}