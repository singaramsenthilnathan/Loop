public class Fibonacci2
{
public static void main(String[]args)
{
int f=-1;
int s=1;
int count=0;
while(true)
{
if(count<=10)
{
s=f+s;
f=s-f;
count++;
System.out.println(f+s);
}
if(count==10)
{
break;
}
}
}
}

/* Output:

c:\java>javac Fibonacci2.java
c:\java>java Fibonacci2
1
1
2
3
5
8
13
21
34
55*/
