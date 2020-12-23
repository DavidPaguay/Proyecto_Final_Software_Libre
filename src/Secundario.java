
public class Secundario {
	
	int año (int a1, int a2) {
	
		while (a1 <= a2) {
			 
			if (a1%4==0 || (a1%100==0 && a1%400==0)) {
				System.out.println(a1);
			
				a1= a1+1;}
	
			else { a1=a1+1;
				
			}	
			
		}
		return a1;
		
	}

}
