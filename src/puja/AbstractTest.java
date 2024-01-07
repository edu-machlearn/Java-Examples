package puja;
abstract class Vechile{
    public int a= 10;
    abstract void showVechile();
}
class Truck extends Vechile{
    void showVechile() {
        System.out.println("This is Truck.."+a);
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        //Truck v = new Truck();
        Vechile v = new Truck();
        v.showVechile();
    }

}
