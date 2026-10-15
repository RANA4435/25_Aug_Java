class StudentIntro{

String name;
int age;
String course;
String college;

void Display(){
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("course="+course);
System.out.println("college="+college);
}
}
public class Intro{
public static void main(String args[]){
  StudentIntro s1=new StudentIntro();
  s1.name="kamdev";
  s1.age=22;
  s1.course="BCA";
  s1.college="Amity University Jharkhand";
  
  s1.Display();
}
}