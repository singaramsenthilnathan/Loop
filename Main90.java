import java.util.Scanner;
public class Main90
{
public static void main(String[]args)
{
Scanner input = new Scanner(System.in);
System.out.println("Enter your Marks :" );
Double marks =input.nextDouble();

String result = (marks>40)?"pass":"fail";

System.out.println("You" +result + "the Exam" );

}
}