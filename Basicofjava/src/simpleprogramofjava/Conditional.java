package simpleprogramofjava;

public class Conditional {
	public static void main(String[]args) {
		int mark =90;
		if(mark>85) {
			
			System.out.println("grade A very excellent");
			}
		else if(mark==80) {
			System.out.println("grade B very good");
		}
		else {
			System.out.println("grade c more practice");
		}
		
		//switch case
		int day=5;
		switch(day) {
		case 1:   
		System.out.println("Mon");
        break;
		case 2:   
		System.out.println("Tue");
        break;
		case 3:   
		System.out.println("Wed");
        break;
		case 4:   
		System.out.println("Thu");
        break;
		case 5:   
		System.out.println("Fri");
        break;
		case 6:   
		System.out.println("Sat");
        break;
		case 7:   
		System.out.println("Sun");
        break;
		case 8:   
		System.out.println("Invalid");
        break;


	}
	

	}
}
