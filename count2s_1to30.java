import java.util.*;
class count2s_1to30
 {
    public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int i,n,temp,rem,count=0;

System.out.println("Enter n value");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
       temp=i;
        while (temp>0)
 {
            rem=temp%10;
if(rem==2)
count++;
temp=temp/10;
        }
}
        System.out.println(count+"  2's");
    }
}
