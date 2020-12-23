import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		 int a1, a2;
		  Secundario bisiesto = new Secundario (); 
		  
		 System.out.println ("Ingrese el primer año");
		 
		 a1= teclado.nextInt();
		 
		 System.out.println ("Ingrese el primer año");
		 
		 a2= teclado.nextInt();
		 
		 System.out.println ("Los años bisiestos son: ");
		
		 bisiesto.año(a1, a2);

	}

}
