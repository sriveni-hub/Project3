import java.util.*;
class Eligibleforvote
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;
System.out.println("Enter the person age");
age=sc.nextInt();
if(age>=18)
System.out.println("person is eligible for vote");
else
System.out.println("person is not eligible for vote");
}
}