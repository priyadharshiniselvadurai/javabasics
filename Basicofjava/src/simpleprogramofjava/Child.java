package simpleprogramofjava;

public class Child  extends Parent{
	public void education() {
		System.out.println("BCA");
		} 
	
	public static void main(String[]args) {
		Child obj=new Child();
		obj.business();
		obj.education();
		obj.vehicle();
		//obj.properties();
		
	}

}

