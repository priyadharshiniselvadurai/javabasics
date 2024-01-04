package simpleprogramofjava;
// method overloading
public class Studentdata {
	public void Student(int id) {
	System.out.println(id);
	}
	public void Student(String name) {
	System.out.println(name);
	}
	public void Student(float amount) {
	System.out.println(amount);
	}
	public static void main(String[]args) {
		Studentdata obj = new Studentdata();
		obj.Student(5);
		obj.Student("priya");
		obj.Student(7985);

	}
	

}
