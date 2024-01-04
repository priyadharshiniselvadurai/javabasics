  package simpleprogramofjava;

public class Abstract implements Bank2{//extends Bank {
	//public void current() {
		//System.out.println("current account");
		
	//}
	//public void salary() {
		//System.out.println("salary account");
		

//}
	//public static void main(String[]args) {
		//Abstract obj=new Abstract();
		//obj.salary();
		//obj.current();
	//	obj.savings();
	//}
	public void current() {
		System.out.println("current account");
		
	}
	public void salary() {
		System.out.println("salary account");
			
		}
		public static void main(String[]args) {
			Abstract obj=new Abstract();
			obj.salary();
			obj.current();
			//obj.savings();

		

}
		@Override
		public void saving() {
			// TODO Auto-generated method stub
			
		}

	}
