package puja;
 class Student{
     String name ;
     Student(String name){
        this.name = name;
     }

     void show(){
         System.out.println("Name : "+name);
     }
 }
public class StudentTest {
    public static void main(String[] args) {
        Student s2 = new Student("Pooja");//2
        s2.show();
    }
}
