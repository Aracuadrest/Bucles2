/**
 *  Generar los números de 1 a 100, imprimir el número, su cuadrado y calcular su sumatoria.
 * @author Araceli
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int num=0;
		int suma=0;
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			System.out.println("El cuadrado de "+i+" es "+(i*i));
			suma = suma+i;
			System.out.println("La sumatoria es "+suma);
		}

	}

}
