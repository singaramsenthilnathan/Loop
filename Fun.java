package test;
import java.util.Scanner;
public class Fun {
static int num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
System.out.println("Enter Number");
num=sc.nextInt();
Fun fn = new Fun();
fn.methodcall();
	}
public void methodcall()
{
	for(int i=1;i<=10;i++)
	{
		System.out.print(num*i + " ");
	}
	System.out.println();
}
}
/* OUTPUT:
 * Enter Number
9
9 18 27 36 45 54 63 72 81 90 
*/
