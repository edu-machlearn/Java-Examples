package puja;

public class Animal {
    int legs = 4;
    int ear = 2;
    void show(){
        System.out.println("I am Animal");
        System.out.println("legs = "+legs+" Ear = "+ear);
    }

    public static void main(String[] args) {
        Animal tiger = new Animal();
        tiger.show();

        Animal lion = new Animal();
        lion.show();
    }
}
