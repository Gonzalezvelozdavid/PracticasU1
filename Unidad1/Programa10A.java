package programaSegundoA;

import java.util.Scanner;

public class Programa10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner op=new Scanner(System.in);
   byte s=1;
   byte c;
   double n=0.0, t=0.0;
   
   System.out.println("Bienvenidos");
   System.out.println("¿Cauntos productos desea registrar?");
   c=op.nextByte();
   
   do{
   System.out.println("Ingrese el precio del producto" + s);
   n=op.nextDouble();
   t=t+n;
   
   s++;
   
	}while(s<=c);
   
   System.out.println("El monto total es: "+t);
   
if(t>=1500){
	t=t*1.11;
}else{
	t=t*1.10;
}
System.out.println("El precio total es: "+t);
}
}