package programaSegundoA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner (System.in);
		DecimalFormat forma = new DecimalFormat("###,###.##");
		
		double producto1=0,producto2=0,producto3=0,total=0;
		
		System.out.println("Bienvenido a la tienda");
		System.out.println("¿Qué desea llevar?");
		System.out.println("Ingrese el precio del producto 1");
		producto1=leer.nextDouble();
		
		System.out.println("Ingrese el precio del producto 2");
		producto2=leer.nextDouble();
		
		System.out.println("Ingrese el precio del producto 3");
		producto3=leer.nextDouble();
		
		total = producto1+producto2+producto3;
		
		if (total>=1500){
			total= total* 1.11;
		}
		else {
			total = total * 1.10;
		}
		System.out.println("Su total es: $"+forma.format(total));
		System.out.println("Gracias por su compra.....");
		
		
	}

}
