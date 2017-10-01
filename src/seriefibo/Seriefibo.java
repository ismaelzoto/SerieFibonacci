package seriefibo;

public class Seriefibo {
	
	public int fibonormal(int n){
		
		int a=1;
		int b=0;
		int fibo;
		
		// inicia sumando el primer numero que es 1 mas el segundo que es 0
		fibo=a+b;
		// permite igualar el primero con el segundo "es decir a ahora igual a b"
		a=b;
		// permite igualar el segundo con lo que obtiene de la suma fibo es decir "b es igual a fibo"
		b=fibo;
			
		fibo=a+b;
		a=b;
		b=fibo;
		
		fibo=a+b;
		a=b;
		b=fibo;
		
		fibo=a+b;
		a=b;
		b=fibo;
		
		fibo=a+b;
		a=b;
		b=fibo;
		
		fibo=a+b;
		a=b;
		b=fibo;
		
		return fibo;
		
	}
	public int fibociclo (int n){
		int fibo=0, primero=1,segundo=0;
		
		while(n>0){
			// suma el primer numero mas el segundo numero
			fibo = primero + segundo;
			//iguala el primero numero con el segundo numero
			primero=segundo;
			// el segundo numero es igual a lo que obtiene de fibo
			segundo=fibo;
			// n va en decremento esto permite sumar al numero anterior
			n--;
		}
		return fibo; 
	 } 
	
	public int fibonaccirecursivo(int n){
		
		//Caso base
		if (n==1 || n==2){
			
			return 1;
		  
		}else {
			// Dominio o Funcion recursiva
			return fibonaccirecursivo(n-1)+ fibonaccirecursivo(n-2);
		}	
	}
}
