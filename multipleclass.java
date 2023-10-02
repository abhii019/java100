public class multipleclass {
    multipleclass(){
        System.out.println("constructor");
    }
    void Computer_method(){
System.out.println("power gone");
    }
    public static void main(String[] args) {
        multipleclass my = new multipleclass();
        Laptop your = new Laptop();

        my.Computer_method();
        your.laptopmethod();

    }
}
class Laptop{
    Laptop(){
        System.out.println("constructor of laptop");

    }
    void laptopmethod(){
        System.out.println("99% battery available");
    }
}
