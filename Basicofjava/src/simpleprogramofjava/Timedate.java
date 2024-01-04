package simpleprogramofjava;
//import java.time.LocalDateTime;
//import java.date.LocalDate;
import java.time.LocalTime;

public class Timedate {
	public static void main(String[]args) {
		
        //string methods
		String subject = " tamil";
		char result = subject.charAt(0);
		System.out.println(result);
		//concat methods
		
		String first =" priya";
		String last ="s"; 
		String result1=first.concat(last);
		System.out.println(result1);

		//contains methods
		String firsts = "priya";
		System.out.println(firsts.contains("c"));
		System.out.println(firsts.contains("a"));
		
		
		//index of
		String firs = "priya is a bca graduate";
		System.out.println(firs.contains("c"));
		
		
		
		//uppercase and lowercase 
		
		String fir = "priya is Bca graduate";
		System.out.println(fir.contains("c"));
		System.out.println(fir.contains("a"));
// is empty
		String name1 ="";
		String name2 ="black is a color  black so  classic";
		String name ="black is a color  black so  classic";

        System.out.println(name2.isEmpty());
        System.out.println(name.replaceAll( "black","white"));
        System.out.println(name.replaceFirst("black","white" ));
        System.out.println(name2.isEmpty());

		//date and time 
	//LocalDateTime obj = LocalDateTime.now();
	//System.out.println(obj);
	}
	
	//date
	//LocalDate obj = LocalDate.now();
	//System.out.println(obj);

	LocalTime obj = LocalTime.now();{
	System.out.println(obj);
	}

}
