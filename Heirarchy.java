class parent{
    void name(){
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
} class Heirarchy{
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        ch1.name();
        Child2 ch2 = new Child2();
        ch2.name();
    }
}