public class stringsmethods {
    public static void main(String[] args) {
        int n;
        String s = "Java programming", t ="", u="";
        System.out.println(s);

        n = s.length();
        System.out.println("Number of characters = " + n);

        t= s.replace ("java","c++");
        System.out.println(s);
        System.out.println(t);

        u = s.concat("is fun ");
        System.out.println(s);
        System.out.println(u);
    }
}
