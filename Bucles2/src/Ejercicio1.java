/**
 *  Obtener los 100 primeros términos de la serie de fibonacci. (0 1 1 2 3 5 8 13 21..)
 * @author Araceli
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int suma;

	    for (int i = 1; i <= 100; i++) {
            System.out.println(num1);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;

	}

}
}