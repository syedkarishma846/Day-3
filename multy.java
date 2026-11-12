class Grandparent{
    void name(){
        System.out.println("This is parent");
    }
}
class parent extends Grandparent{
    parent(){
        System.out.println("This is Child1");
    }
}
class Child extends parent{
    Child(){
        System.out.println("This is Child2");
    }
}
class multy{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name();
    }
}