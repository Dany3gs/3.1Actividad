package Ejercicio5;

/*5.- Elaborar una clase RACIONAL que modele los números racionales implementando al menos las operaciones de suma,
resta, opuesto e inverso de un número racional a imitación de la suma o resta de los números reales o enteros.*/

public class Main {

	public static void main(String[] args) {

		// Creamos dos objetos
		Racional a = new Racional(1,2);
		Racional b = new Racional(2,3);

		//Sumamos y restamos racionales
		Racional resultadoSuma = a.sumar(b);
		Racional resultadoResta = a.restar(b);
		
		System.out.println("-----------Suma-------------");
		System.out.println(resultadoSuma);
		
		System.out.println("");
		
		System.out.println("-----------Resta-------------");
		System.out.println(resultadoResta);
		
		System.out.println("");
		
		System.out.println("-----------Opuesto de suma y resta-------------");
		System.out.println(resultadoSuma.opuesto());
		System.out.println(resultadoResta.opuesto());
		
		System.out.println("");
		
		System.out.println("-----------Inverso de suma y resta-------------");
		System.out.println(resultadoSuma.inverso());
		System.out.println(resultadoResta.inverso());
		
	}
}
