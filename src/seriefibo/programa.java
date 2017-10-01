package seriefibo;

public class programa {
	
	public static void main (String[] args){
	
		Seriefibo fibo = new Seriefibo ();
		
	System.out.println("la sucesion fibonacci de 6 por medio de variables es de: "+fibo.fibonormal(6));	
		
	System.out.println("la sucesion fibonacci de 12 por medio de un ciclo es de: "+fibo.fibociclo(12));	
		
	System.out.println("la sucesion fibonacci de 12 por medio de Recursividad es de: "
		+ fibo.fibonaccirecursivo(12));	
		
	
		
	}
	
}