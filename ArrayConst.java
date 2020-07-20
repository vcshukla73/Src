import java.util.ArrayList;

public class ArrayConst {
	
	int a;
	ArrayList <String> col = new ArrayList <String>();
	
	public ArrayConst(int a, ArrayList<String> col) {
		this.a = a;
		this.col = col;
	}


	public ArrayConst() {
		this.a = 0;
		this.col = new ArrayList<String>();
	}

	
		public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public ArrayList<String> getCol() {
		return col;
	}

	public void setCol(ArrayList<String> col) {
		
		col.add("Red");
		col.add("Orange");
		col.add("Pink");
		
		this.col = col;
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ArrayConst a1=new ArrayConst();
		
		System.out.println(a1.getCol());

	}

}
