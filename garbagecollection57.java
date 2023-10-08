import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class garbagecollection57 {
   public static void main(String[] args)throws Exception {
    Runtime rs = Runtime.getRuntime();
    System.out.println("Free memory in Jvm berfore Garbage collection"+rs.freeMemory());
 System.out.println("'Free memory in Jvm after garbage collection"+rs.freeMemory());  
} 
}
