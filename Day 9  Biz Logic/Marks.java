class Marks
{
public static void main(String args[])
{
boolean result=Marks.doSomething(100, true);
System.out.println("result="+result);

}
 static boolean doSomething(int marks, boolean result)
{
System.out.println("result="+marks+" "+result);
return result;
}
}