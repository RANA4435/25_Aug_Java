class Student{
  String name;
  int age;
  
  void Display(){
  System.out.println("name="+name);
  System.out.println("age="+age);
  }
}
public class Details{
public static void main(String args[]){

Student s1=new Student();
s1.name="sandeep";
s1.age=22;
s1.Display();

}
}