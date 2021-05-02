package test;

public class DoWhile
{
public static void main(String[] args) {
		// TODO Auto-generated method stub
DoWhile dw = new DoWhile();
	dw.reverse();
	}
	String ss = "java";
	char ch;
	int j =ss.length();
	private void reverse() 
	{
	do	
	{
	System.out.print(ss.charAt(j-1));
	j--;
	}
	while(j>0);
}
}
