/**
 *  Generar los términos de la serie de fibonacci que sean menores que 1000.
 * @author Araceli
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int suma;

	    for (int i = 1; i <= 100; i++) {
	    	while (num1<1000) {
            System.out.println(num1);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
            }

	}

	}

}
