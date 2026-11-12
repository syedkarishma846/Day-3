class parent{
    void name(){
        System.out.println("This is parent");
    }
}
class Child extends parent{
    Child(){
        System.out.println("This is Child");
    }
}
class single{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name();
    }
}