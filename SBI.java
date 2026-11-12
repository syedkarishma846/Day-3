class parent{
    void name(){
        System.out.println("RBI");
    }
}
class Child1 extends parent{
    Child1(){
        System.out.println("SBI");
    }
}
class Child2 extends parent{
    Child2(){
        System.out.println("HDFC");
    }
}
public class SBI{
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        ch1.name();
        Child2 ch2 = new Child2();
        ch2.name();
    }
}