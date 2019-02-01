package programaSegundoA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa12A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		
		
		boolean flag = true;
		double precio=0,suma = 0,total= 0,i=0;
		double venta=0, ventaCh=0, ventaMed=0, ventaGr=0;
		double totalCh=0,totalMed=0,totalGr=0;
		double numCh=0,numMed=0,numGr=0;
		byte opcion = 0;
		
		System.out.println("Bienvenido al sistema de ventas");
		
		do {
			
			System.out.println("Ingrese el precio del objeto a comprar: ");
			precio = leer.nextDouble();
			
			i++;
			
			System.out.println("¿Desea comprar otro objeto?");
			System.out.println("1.-Si, porfavor");			
			System.out.println("2.- No gracias!!");
			opcion = leer.nextByte();
			
			
			if(precio < 200) {
				totalCh+=precio;
				numCh++;
			}
			if(precio >= 200 && precio <= 400) {
				totalMed+=precio;
				numMed++;
			}
			if(precio > 400) {
				totalGr+=precio;
				numGr++;
			}
			
			if(opcion == 2  || opcion == 1) {
				if(opcion==2) {
					flag = false;
				}
				if(opcion==1) {
					System.out.println("Continuaré capturando objetos...");
				}
			}
			else {
				System.out.println("Ingrese una opción valida...");
			}
			
		}while(flag);
		
		ventaCh=totalCh/numCh;
		ventaMed=totalMed/numMed;
		ventaGr=totalGr/numGr;
		
		System.out.println("Su venta menor de 200 fue: $"+ventaCh);
		System.out.println("Su venta mayor de 200 y menor de 400 fue: $"+ventaMed);
		System.out.println("Su venta mayor de 400 fue: $"+ventaGr);
	}

}

	

