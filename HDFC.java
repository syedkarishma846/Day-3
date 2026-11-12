class Grandparent{
    void name(){
        System.out.println("SBI");
    }
}
class parent extends Grandparent{
    parent(){
        System.out.println("SBI");
    }
}
class Child extends parent{
    Child(){
        System.out.println("HDFC");
    }
}
class HDFC {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name();
    }
}

    

