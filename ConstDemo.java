public class ConstDemo {
	
	int x,y,z;
	

	
	ConstDemo(){
		
			System.out.println("ConstDemo.ConstDemo()");
			
		}
	
public 	ConstDemo(int x,int y)
	{
	this.x=x;
	this.y=y;
	
	
	int z=x+y;
		System.out.println("Answer is "+z);
	}
    
/*public 	ConstDemo(int x,int y,int z)
{
	int x=a;int y=b;
	int z=x+y;
	System.out.println("Answer is "+z);
}*/
	
	
	
	
	
	public static void main(String[] args) {
		
		
		ConstDemo cd=new ConstDemo();
		ConstDemo cd1=new ConstDemo(100,200);
		

		
		
		

	}

}
