class Grandparent{
    void name(){
        System.out.println("This is Grand parent");
    }
}
class parent extends Grandparent{
    parent(){
        System.out.println("This is parent");
    }
}
class Child1 extends parent{
    Child1(){
        System.out.println("This is Child1");
    }
}
class Child2 extends parent{
    Child2(){
        System.out.println("This is Child2");
    }
} 
class Hybrid{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name();
    }
}