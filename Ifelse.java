import java.util.Scanner;
public class Ifelse
{
public static void main(String[]args)
{
//int no;
Scanner input = new Scanner(System.in);
System.out.println("Enter any Number:");
int no =input.nextInt();
if(no>0)
{
System.out.println("Number is Positive");
}
else
{
System.out.println("Number is Negative");
}

}


}