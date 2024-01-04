package simpleprogramofjava;
import java.util.Arrays;
import java.util.Scanner;
public class Datatype {
	public static void main(String[]args) {
		byte age=20;
		short salary=20000;
		int myid=56789843;
		long myaadhar=56783975409873l;
		char initial = 'p';
		float height=5.3f;
		double heightcm=168.6000d;
		boolean positive=true;

        System.out.println(age);
        System.out.println(salary);
        System.out.println(myid);
        System.out.println(myaadhar);
        System.out.println(initial);
        System.out.println(height);
        System.out.println(heightcm);
        System.out.println(positive);
        
        
        //non primitive data type
        
        String[] color ={"pink","blue","black","purple"};
        System.out.println(color[2]);
        System.out.println(Arrays.toString(color));
        
        // GET INPUT USER
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the name");
        String name = obj.nextLine();
        System.out.println("use name is:"+name);
        System.out.println("enter the ages");
        int ages = obj.nextInt();
        System.out.println("use age is :"+ages);

   


	}

}
 