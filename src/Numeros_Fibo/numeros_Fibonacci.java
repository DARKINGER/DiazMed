package Numeros_Fibo;

public class numeros_Fibonacci {

public static void main(String[] args) {
		
		int val1=0, val2=1, contador=0;
		double promedio=0;
		System.out.println(val1);
		System.out.println(val2+"\n"+ "----------------"+"\n");
		
		while(contador < 10 )
		{
			int valResultado=val1+val2;
			System.out.println(val1 +"+"+ val2+" = " +valResultado);
			
			val1=val2;
			val2=valResultado;
			contador++;
		}
		
		
	}
}
