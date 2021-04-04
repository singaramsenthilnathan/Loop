public class Fibonacci1
{
public static void main(String[]args)
{
	int f=-1,s=1,t;
	t=f+s;
	int count=0;
	while(true)
	{
	if(count<=10)
	{
	f=s;
	s=t;
    t=f+s;
	count++;
	System.out.println(f+s);
	}
	if(count==10)
	break;
	}
	
}
}


/*Output:
c:\java>javac Fibonacci1.java

c:\java>java Fibonacci1
1
1
2
3
5
8
13
21
34
55 */

    

