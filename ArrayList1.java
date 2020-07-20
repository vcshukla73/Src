import java.util.ArrayList;

public class ArrayList1 {

	private static final Boolean e = null;

	public static void main(String[] args) {

		
		ArrayList ar= new ArrayList();
		ar.add("Raj");
		ar.add("Rashmi");
		ar.add("Rohan");
		ar.add(1000);
		ar.add(null);
		ar.add(true);
		ar.add(6,"Vaibhav");
		ar.add(5,"Vaibhav");
		ar.add(0,"Roza");
		

		
		System.out.println(ar.get(0));
		System.out.println(ar.get(2));
		
		for(int i=0;i<ar.size();i++)
		{
			//System.out.println(ar.get(i));
			System.out.println(ar);
			
			
		}
		
		
		ar.remove(1);
		System.out.println(ar.get(1));
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		
		
		for(int a : ar1)
		{
			System.out.println(a);
		}
		
		ArrayList<Integer> ar2= new ArrayList<Integer>();
		
		for(int j:ar1) {

			ar2.add(j);
		
		}
		
		
System.out.println("=====================================");		
		
		for(int k :ar2) {
			System.out.println(k);
		}
		
		
		
	ArrayList<Boolean> b1=new ArrayList<Boolean>();
	b1.add(true);
	b1.add(null);
	b1.add(false);
	b1.add(e);
	
	
		
		
		
		
	}

}
