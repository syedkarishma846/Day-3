class Rbi{
    void money(){
        System.out.println("Executing money() from Rbi");
    }
}
class Sbi extends Rbi{}
class Hdfc extends Sbi{}
class User extends Sbi{}
public class simple2{
    public static void main(String[] args) {
        User user = new User();
        user.money();
    }
}