package simpleprogramofjava;

public class Sec {
	public void studentName() {
		System.out.println("priya");
	}
	public void studentAge() {
		System.out.println(24);
	}
	public void studentDob() {
		System.out.println(19.5);
	}
	public static void main(String[]args) {
		Sec obj= new Sec();
		obj.studentName();
		obj.studentAge();
		obj.studentDob();
		
	}
}