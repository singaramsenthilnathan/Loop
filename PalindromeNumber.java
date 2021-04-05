public class PalindromeNumber
{
public static void main (String[]args)
{
int no = 484;
int no2=no;
int rem = 0;
while(no>0)
{
rem =(rem*10)+no%10;
no=no/10;
}
if(no2==rem)
System.out.println("PALINDROME NUMBER :" + no2);
else
System.out.println("Not a PALINDROME NUMBER");
//String result = (no2==rem)? "PALINDROME" : "NOT A PALINDROME";
//System.out.println( result);
}
}







