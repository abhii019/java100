public class constructoverloading {
    String name;

    constructoverloading(){
        System.out.println("constructor method called");
    }
   constructoverloading(String t){
            
    name =t;
    }
    public static void main(String[] args) {
        constructoverloading cpp = new constructoverloading();
        constructoverloading java= new constructoverloading("java");

        cpp.setName("cPP");
        java.getName();
        cpp.getName();
    }

    void setName(String t){
        name=t;
    }
    void getName(){
        System.out.println("language name "+name);

    }
}
