import java.util.Scanner;

public class Second {
	public static String ename;
	public static double hrate;
	public static double pay;
	public static double gp;

	public static void getdata() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Name");
		ename = sc.nextLine();

		System.out.println("Enter Employee Pay");
		pay = sc.nextDouble();
		
		System.out.println("Enter Employee Hourly rate");
		hrate = sc.nextDouble();

	}

	public static void getproc() {
		gp = pay * hrate;
		if (gp <= 1500) {
			gp = gp - 100;
		} else if (gp > 1500 && gp < 3000) {
			gp = gp - 200;
		} else if (gp >= 3000 && gp < 5000) {
			gp = gp - 300;
		} else if (gp >= 5000 && gp < 7000) {
			gp = gp - 500;
		} else {
			gp = gp-0;
		}

	}

	public static void display() {
		System.out.println("Enter Employee Name" + ename);
		System.out.println("Enter Employee Pay rate" + pay);
		System.out.println("Enter Employee Hours" + hrate);
		System.out.println("Enter Employee Gross pay" + gp);

	}

	public static void main(String[] args) {

	boolean Choice=false;
	String ch;
	for(int i=0;i<3;i++)
	{
		System.out.println("Employee Calculator");
		Scanner sc1 = new Scanner(System.in);		
		getdata();
		getproc();
		display();
		
		System.out.println("Do you want to cont....y/n");
		ch=sc1.nextLine();
		if(ch=="No") 
		{	
			break;
		}	
			
	}	
	}
	
}
