import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		 int a1, a2;
		  Secundario bisiesto = new Secundario (); 
		  
		 System.out.println ("Ingrese el primer a�o");
		 
		 a1= teclado.nextInt();
		 
		 System.out.println ("Ingrese el primer a�o");
		 
		 a2= teclado.nextInt();
		 
		 System.out.println ("Los a�os bisiestos son: ");
		
		 bisiesto.a�o(a1, a2);

	}

}
