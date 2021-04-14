public class Gain
{
public static void main(String[]args)
{
int[] a = {10,10,30,40,60,10,10,20,40,30};
int no = a[0];
int count =1;
for(int i=1;i<a.length;i++)
{
	if(no==a[i])
	{
		count++;
	}
}
System.out.println(count);
no= a[2];
count=1;
for(int i=3;i<a.length;i++)
{
	if(no==a[i])
	{
		count++;
	}
}
System.out.println(count);
no=a[3];
count=1;
for(int i=4;i<a.length;i++)
{
	if(no==a[i])
	{
		count++;
	}
}
System.out.println(count);
}
}
