import java.util.*;
class  EmployeeGp
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float bp,da,hra,pf,np,gp;
System.out.println("Enter the basic pay :");
bp=sc.nextFloat();
da=25/100f*bp;
hra=15/100f*bp;
pf=8.33f/100*bp;
np=bp+da+hra;
gp=np-pf;
System.out.println("Gross pay:" +gp);
}
}
