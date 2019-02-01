package programaSegundoA;

import java.util.Scanner;

public class Programa11A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner op = new Scanner(System.in);
		int c=0, a=0;
		double isr=0;
System.out.println("¿Cuantos empleados va a registrar?");
int e=op.nextInt();
int[] valores = new int[e];

for (int i = 0; i < e; i++){
	do{
		c++;
		System.out.println("Ingrese el sueldo del trabajador: "+c);
		valores[i]=op.nextInt();
		a+=valores[i];
		
	}while (c<=e);
}
int min = valores[0];
int max = valores[0];

for(double i = 1; i < e; i++);{
	int i = 0;
	if (valores[i] < min){
		
	}else if (valores[i] > max){
		max= valores[i];
		
	}
}


System.out.println("El sueldo minimo del empleado es: "+min);
System.out.println("El sueldo maximo del empleado es: "+max);
System.out.println("El monto total es: "+a);
System.out.println("El monto con ISR es: "+(isr=a*.67));


}
}


