package simpleprogramofjava; 

public class Loop {
public static void main(String[]args) {
		int i=0;
		while(i<=15){
		System.out.println(i);
		i++;
		
		//Do While
		do {
			System.out.println(i);
			i++;
		}
			while(i<=10);
		
		
		//For Loop
		
        for( i=0;i<=10;i++) {

			System.out.println(i);
		}
        

		
		
		//break statement
		
         for(int p=0;p<=10;p++) {
			if(p==4) {
				break;
			}
			System.out.println(p);
		}
         
         
         
         //Continue Statement
         
         for(int p=0;p<=10;p++) {
			if(p==4) {
				continue;
			}
			System.out.println(p);
         }
	}
}
}


