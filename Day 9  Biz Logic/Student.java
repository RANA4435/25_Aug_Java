class Student
{
public static void main(String args[])
{
boolean result=Student.doSomething(100, true);
System.out.println("result="+result);
}
static boolean doSomething(int marks, boolean pass)
{
System.out.println("Marks="+marks);
return pass;
} 
}