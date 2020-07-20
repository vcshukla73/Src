package PtwSundayBatch;

public class DataTypes {

	public static void main(String[] args) {

//		 This is my first java code
		/*
		 * Author Vaibhav Shukla; Date : 05-20-2020; Data Types
		 * 
		 * 
		 * 
		 */
	
	
	
	
	//1. non primitive data types  : String Array
	//2. primitive data types
			//a.Boolean : true , false
			//b. Numric :
					//1. Character  : char
					//2. Integeral : byte,short,int,long
							//2.1 floating point   float,double
	
	
	//1. byte
	//size : 1 byte = 8 bits
	//range : -128 to 127 == 256
	
	byte b=(byte)257;
	byte c=065;
	System.out.println(b); //1
	System.out.println(c); //53
	
	
	//1. short
	//size 2 : byte = 16 bits
	//range -32767 to 32768
	short s1=(short)50000;
	System.out.println(s1); //15536
	
	//3.int
	//size : 4 bytes = 32 bits
	//range 2^31 to 2^31-1
	int i;
	i=120;
	System.out.println(i+20); //140
	System.out.println(i+120);
	int p='^';
	System.out.println(p);
	
	
	
	
	
	//4 . long
	//size 8 bytes = 64 bits
	//range 2^63 to -2^63
	long l1=123456789101112l;
	System.out.println(l1);
	
	
	//5. float
	//size 4 bytes = 32 bits
	//range after .upto 8 digits
	float f3=(float)200.1234567;
	float f4=200.75f;
	System.out.println(f3);
	System.out.println(f4);
	float f5=100;
	System.out.println(f5);
	
	
	
	
	// 6 double
	//size 8 bytes = 64 bits
	// after . upto 15 digits
	double d=12.123456789101112;
	System.out.println(d);
	
	//7 char
	char c1='a';
	char c2='b';
	char c3='$';
	char gender='f';
	
	System.out.println(gender);
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c1+c2);
    
    byte b5=065;
    System.out.println(b5);
    
	
	
	String s3="Hello";
	String s2="World";
	int t1=100;
	int t2=200;
	
	
	System.out.println(s2);
	System.out.println(s3);
	
	System.out.println(s3+s2);
	System.out.println(s3+"      "+s2);
	System.out.println("Hello World");
	int a1=150;
	System.out.println("Answer is "+a1);
	System.out.println(t1+t2);
	System.out.println(s3+s2+"   "+(t1+t2));
	System.out.print(s3+"\n");
	System.out.print(s2);
	System.out.print(s3+"\t");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
	  
	  
	
	
	
	}
	
}


