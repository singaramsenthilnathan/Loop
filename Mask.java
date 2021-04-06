public class Mask
{
public static void main(String[]args)
{
Mask m =new Mask();
int r=m.MaskOff(6);
System.out.println(r);

}




public int MaskOff( int n )
{
 return n | 3 ;
 }
 }



/*6 value in Binary:

16      8       4     2      1
0       0       1     1      0
0       0       0     1       1 (OR)
        0       0     1       1        */

/*Output:
c:\java>javac Mask.java

c:\java>java Mask
7
*/


