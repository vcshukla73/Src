import java.util.ArrayList;

public class MethodAssignment {

	
	
	public int addTwoNumbers(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	
	
	public String returnProduct(int a,int b)
	{
		String prodName;
		if(a==10 && a==20) {
			prodName="Accer";
		}	
		else
		{
			prodName="Enter Proper Product Code";
		}
		return prodName;
	}
	
	//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 
	
	public void circumArea(int radious)
	{
		System.out.println("circumference "+2*3.14*radious);
		System.out.println("area is "+3.14*radious*radious);
	}
	
	public void findBiggerNumber(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println("A is Greater");
		}else if(b>c)
		{
			System.out.println("B is Greater");
		}
		else
		{
			System.out.println("C is Greater");
		}
	}
	
public void evenOdd(int a)
{
	if(a%2==0)
	{
		System.out.println("Number is Even");
	}
	else
	{
		System.out.println("Number is Odd");
	}
}
	
	public void findVotingAge(int a)
	{
		if(a>=18) {
			System.out.println("Person is eligiable for vote");
		}
		else
		{
			System.out.println("Person is not eligiable for vote");
		}
	}
	public void primeNumber(int a)
	{
		
		  boolean flag = false;
	      for(int i = 2; i <= a/2; ++i)
	        {
	            // condition for nonprime number
	            if(a % i == 0)
	            {
	                flag = true;
	                break;
	            }
	        }

	        if (!flag)
	            System.out.println(a + " is a prime number.");
	        else
	            System.out.println(a + " is not a prime number.");
    }
		
	
	
	public int factorial(int a)
	{
		if(a==0||a==1) {
			return 1;
		}else
		{
			return factorial(a-1)*a;
		}
		
	}
	
	
public void grade(int marks)
{
	if(marks>=91 && marks <=100)
		System.out.println("AA");
	else if(marks>=81 && marks <=90)
		System.out.println("AB");
	else if(marks>=71 && marks <=80)
		System.out.println("BB");
	else if(marks>=61 && marks <=70)
			System.out.println("BC");
	else if(marks>=51 && marks <=60)
		System.out.println("CD");
	else if(marks>=41 && marks <=50)
		System.out.println("DD");
	else
		System.out.println("FAIL");
}
	


public ArrayList<String> getDeptList()
{
	ArrayList<String> dept= new ArrayList<String>();
	dept.add("Sales");
	dept.add("Account");
	dept.add("Purchase");
		
	return dept;

}


public String [] getBoardMembers() {
	
	String ar1[]=new String[4];
	ar1[0]="Rajesh";
	ar1[1]="Rupa";
	ar1[2]="Roza";
	ar1[3]="Ramesh";
	
return ar1;
}

public ArrayList<Object> getCompanyInfo()
{
ArrayList<Object> comp1=new ArrayList<Object>();

comp1.add("Sam's");
comp1.add(20);
comp1.add(true);
comp1.add(2000.20);

	
return comp1;

	
}


			
	
	
	
}














	
	
		
		
