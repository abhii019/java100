public class methods {
    
    methods(){
        System.out.println("Constructor method");
    }

    public static void main(String[] args){
       staticMethod();
      methods object = new methods();
      object.nonStaticMethod();
    }
    static void staticMethod(){
        System.out.println("Satic method can be called creating object ");
    }

    void  nonStaticMethod(){
        System.out.println("non static method must me called by creating an object");
    }
}
