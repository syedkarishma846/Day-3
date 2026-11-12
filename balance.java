abstract class Parent{
    abstract void money();
    void balance(){
        System.out.println("Bank balance is available");
    }
}
class Child extends Parent{
    void money(){
        System.out.println("SBI provide money");
    }
}
public class balance{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.money();
        ch.balance();
    }
} 