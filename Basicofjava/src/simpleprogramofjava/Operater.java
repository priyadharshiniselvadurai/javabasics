package simpleprogramofjava;

public class Operater {
	public static void main(String[]args) {
		//Arithmetic operator
		int a=5;
		int b=6;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b);
		System.out.println(a/b);	
		
		//Increment
	    int c= 54;
	     c++;//post increment
          ++c;//pre increment
		System.out.println(c);
		//System.out.println(h);

		//Decrement
		int d=67;
		 --d;//pre decrement
		 d--;//post decrement
		System.out.println(d);
		
		//Compound Assignment
		// example:a=a+3;
		a+=3;  
		System.out.println(a);
		
		     //or
     
		//Assignment operator
		// a=a+3;
		System.out.println(a);
		a-=4;
		System.out.println(a);
		a*=4;
		System.out.println(a);
		a/=4;
		System.out.println(a);
		a%=4;
		System.out.println(a);

		
		//Comparison operator
		int x=10;
		int y=20;
	    System.out.println(x==y);
		System.out.println(x!=y);
		System.out.println(x<y);
		System.out.println(x>y);
		System.out.println(x<=y);
		System.out.println(x>=y);
		
		//Logical operator
		int p=15;
		int q=25;
		System.out.println((p!=q)&&(p<q));
		System.out.println((p==q)||(p<q));
		System.out.println(!(p==q)&&(p<q));



	

	}

}
