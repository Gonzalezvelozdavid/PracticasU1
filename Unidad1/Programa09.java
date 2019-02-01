package programaSegundoA;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
	byte op=0;
	double medidas=0, resultado=0;

		System.out.println("Menú de opciones ");
		System.out.println("1.- Pulgadas a Centimetros");
		System.out.println("2.- Pies a Centimetros.");
		System.out.println("3.- Pies a Pulgada.");
		
		op=leer.nextByte();
		
		System.out.println("Ingrese la medida a convertir.");
		
		medidas= leer.nextDouble();
		
		switch(op){
		  case 1: 
			  resultado= medidas * 2.54;
			  System.out.println("El resultado en pulgadas es: "+resultado+"cm");
			  break; 
		
		  case 2: 
			  resultado= medidas * 30.48;
			  System.out.println("El resultado en pies son: "+resultado+"cm");
			  break;
			  
		  case 3: 
			  resultado= medidas * 12;
			  System.out.println("El resultado en pies son: "+resultado+"plg");
			  break;
		
	  
		


	}

}}
