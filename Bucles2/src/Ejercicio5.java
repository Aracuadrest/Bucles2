/**
 *  Calcular el factorial de los n�meros del 1 al 20, imprimir el n�mero con su correspondiente factorial y
adem�s la sumatoria de factoriales.
 * @author Araceli
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		int factorial=1;
		int suma=0;
		
		for(int i=1;i<=20;i++) {
			factorial= factorial*i;
			suma=suma+factorial;
			System.out.println("El factorial de "+i+" es "+factorial);
			System.out.println("La suma factorial es "+suma);
		}
		

	}

}
