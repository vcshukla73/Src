
public class MethodOver {
	
	
	 void displ(){
		 
		 System.out.println("MethodOver.displ()");
		 
	}
	
	 void displ(int a) {
		 System.out.println("Parameters a "+a);
	 }
	public  void displ(int a,int b) {
		
		
		System.out.println("Passing two values");
		
	}
	public static  int  displ(int x,int y,int z)
	{
		int m=x+y+z;
		return m;
		
		
	}
	

	public static void main(String[] args) {
		MethodOver mt=new MethodOver();
		
		
		
		mt.displ();
		mt.displ(100);
		mt.displ(100,200);
		int f=displ(20,30,40);
		System.out.println(" answer is "+f);
		System.out.println("value of m"+mt.displ(100, 2000, 3000));
		
		
		
		
		

	}

}
