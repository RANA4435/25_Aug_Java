class Employee{

 String name;
 int salary;
 int age;
 
 void Display(){
 System.out.println("name="+name);
 System.out.println("Salary="+salary);
 System.out.println("Age="+age);
 }
}
public class Details1{
public static void main(String args[]){

Employee[] s1=new Employee[1];
  s1[0] =new Employee();

s1[0].name="satish"
s1[0].salary=90000;
s1[0].age=40;

s1[0].Display();
}
}