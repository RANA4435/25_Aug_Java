class Student{
String name;
String course;
String college;
String Address;
int age;

void Display(){
System.out.println("name="+name);
System.out.println("course="+course);
System.out.println("Address="+Address);
System.out.println("age="+age);
System.out.println("college="+college);
}
}
public class Details{
public static void main(String args[]){
Student s1=new Student();
 s1.name="Kamdev";
 s1.course="BCA";
  s1.college="Amity University Jharkhand";
   s1.Address="Ranchi";
    s1.age=22;
	
	s1.Display();
}
}