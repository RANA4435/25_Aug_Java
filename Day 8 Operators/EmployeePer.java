class EmployeePer{
public static void main(String args[]){
  int   minTask = 10;
  int   maxTask = 20;
  
  int userName=Integer.parseInt(args[1]);
  String name=args[0];
  
  System.out.println("Name="+name);
  
  System.out.println("BAD Performance="+(minTask<userName));
  System.out.println("GOOD Performance="+(maxTask>userName));
  
  System.out.println("Result="+(minTask<userName && maxTask>userName));
  
}
}