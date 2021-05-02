public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loop lp =new Loop();
lp.forloop();
	}

	private void forloop() {
		// TODO Auto-generated method stub
		for(int i=100;i>=0;i=i-5)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	
}
/*OUTPUT:
100 95 90 85 80 75 70 65 60 55 50 45 40 35 30 25 20 15 10 5 0 
*/
