 import java.util.*;
class Difineclass
{
public static void main(String args[])
{
int sno,tm;
char name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the details sno,tm and name");
sno=sc.nextInt();
tm=sc.nextInt();
name=sc.next().charAt(0);
if(tm>360)
{
System.out.println("Frist class");
}
else if(tm>=300 && tm<360)
{

System.out.println("Second class");
}
else if (tm<300)
{
System.out.println("Third class");
}
else
{
System.out.println("fail");
}
}
}