import java.util.Scanner;
public class Ifelse1
{
public static void main(String[]args)
{
//int no;
Scanner input = new Scanner(System.in);
System.out.println("Enter any Number:");
int no =input.nextInt();

String number = (no>0) ? "Positive" : "Negative";
System.out.println("Number is :"+ number);
}
}