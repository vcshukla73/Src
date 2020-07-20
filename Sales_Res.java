import java.util.Scanner;

public class Sales_Res {
	
	static String Prod_Name;
	static double Prices;
	static double Qty;
	static double Amt;
	static double disc;
	Scanner sc =new Scanner(System.in);
	
	public static void getdata() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Product Name ");
		Prod_Name=sc.nextLine();
		
	boolean isdata=false;	
	do
	{
		System.out.println("Enter Product Qty. ");
		Qty=sc.nextDouble();
		if(Qty>0&&Qty<=999999) {
			isdata=true;
			
		}else
		{
			isdata=false;
			
		}
		
	}while(isdata==false);	
		
		System.out.println("Enter Product Price ");
		Prices=sc.nextDouble();
		
		}
	public static void getprocess() {
		
		Amt=Qty*Prices;
		if(Amt<1500) {
			disc=Amt*.10;
		}else if(Amt>=1500&&Amt<3000) {
			disc=Amt*.20;
			
		}else if(Amt>=3000&&Amt<4500) {
			disc=Amt*.30;
		}
		else {
			disc=Amt*.40;
		}
		
	}
	
 public static boolean result() {
	 String cho;
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Do you want to Cont....");
	 cho=sc.nextLine();
	 if(cho.equalsIgnoreCase("No")){
	 		return false;
	 }else
	 {
		 return true;
	 }
	 
	 
 }
 
 
 
 public static void thk() {
	 System.out.println("Thank You for Shopping ");
 }
	
  public static void disp() {
	  System.out.println("Produt Name"+Prod_Name);
	  System.out.println("Quntity "+Qty);
	  System.out.println("Rate "+Prices);
	  System.out.println("Total Amount "+Amt);
	  System.out.println("Discount "+disc);
	  System.out.println("After Discount Net Amount "+(Amt-disc));
  }
	

	public static void main(String[] args) {
	
		
	for(int i=1;i<=3;i++) {	
		getdata();
		getprocess();
		disp();
		if(result()==false)
		{
			break;
		}	
		}
		thk();
		
	}
	}

