//1 2 4 5 7 8 10
//3 6 9

public class Avoider
{
public static void main(String[]args)
{
int n = 1;

//String num
while(n<11)
{
if(n%3==0)
{
n++;
continue;
}
System.out.println(n);
n++;

}
}


}
