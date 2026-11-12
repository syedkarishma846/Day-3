class parent{
    void name() {
        System.out.println("RBI");
    }
}
class Child extends parent{
    Child(){
        System.out.println("SBI");
    }

}
public class RBI {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name();
    }
}
    
