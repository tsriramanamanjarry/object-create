class Student{
private int roll;
private String name;
private String dept;
void passData(int roll,String name,String dept)
{
this.roll=roll;
this.name=name;
this.dept=dept;
}
String display()
{
return roll+" "+name+" "+dept;
}
}
public class Object1{
public static void main(String[]args){
Student s1 = new Student();
Student s2 = new Student();
s1.passData(1,"Namjoon","cse");
s2.passData(2,"Jimin","cse");
System.out.println(s1.display());
System.out.println(s2.display());
}
}
