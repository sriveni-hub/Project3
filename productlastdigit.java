import java.util.*;
class productlastdigit
{
public static void main(String args[])
{
int x,y,z;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the three integer values");
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
int Ld1=x%10;
int Ld2=y%10;
int Ld3=z%10;
int product=Ld1*Ld2*Ld3;
System.out.println("Product of the last digit:"+product);
}
}






