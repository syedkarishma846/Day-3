abstract class Animal{
    abstract void sound();
    void behaviour(){
        System.out.println("Animal is white");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog..");
    }
void sound(){
    System.out.println("Dog is barking..");
}
void behaviour(){
    System.out.println("Friendly behavior");
}
void color(){
    System.out.println("Black");
}

}
public class colour{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.behaviour();
        d.color();
    }
}