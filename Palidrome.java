import java.io.*;
class Palidrome
{
              public static void main(String args[])
              {
                
                 int a =234;
                 String result;

                 result=(a%10==a/100)?"Palindrome":"Not a palindrome";

                 System.out.println(result);
              }
}