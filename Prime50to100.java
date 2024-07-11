import java.util.*;
class Prime50to100
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,x,count=0;
for(i=50;i<=100;i++)
{
x=0;
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
x=1;
break;
}}
if(x==0)
{
System.out.println(i+" ");
count++;
}

}
System.out.println("count="+count);

}
}