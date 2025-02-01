package Ejercicio3;

/* 3.- En el ejercicio anterior, el atributo autor de Libro y los atributos protagonista y director de Película se
definieron como de tipo String. Dado que estos atributos contienen el nombre de una persona, esta definición puede no
ser homogénea. Por lo tanto, un mejor modelo sería considerar la clase adicional:

-> Persona, cuyos atributos son nombre y apellido, de tipo String. Esta clase, además de contener sus respectivos
métodos getters y setters, considera el método:

-> esIgual(Persona p), que devuelve true si el nombre y apellido de un objeto Persona son iguales a las de la persona
p y false en caso contrario.

De esta forma, las clases Libro y Película se tienen que redefinir como sigue:

-> Libro, cuyos atributos son autor de "tipo Persona" (nos indica relación de composición), título de tipo String y
   precio de tipo Float.

-> Película, con los atributos protagonista y director de "tipo Persona" (nos indica relación de composición), título
   de tipo String y precio de tipo Float.

Implementa la clase Persona y la redefinición de las clases Libro y Película, considerando los atributos y métodos
descritos. */

/** En este ejercicio la relación que nos indica entre la clase Persona con Película y Libro es de "Composición", ya que
 * Libro y Película no "son una" Persona, sino que "tiene" una Persona como autor, protagonista o director.
 * */

public class Main {
    public static void main(String[] args) {
        // Ejemplo de comprobación, no requerido en ejercicio

        // Creamos una instancia de persona
        Persona autor = new Persona("Gabriel", "García Marquez");
        Persona protagonista = new Persona("Robert", "De Niro");
        Persona director = new Persona("Christopher", "Nolan");

        // Creamos una instancia de libro
        Libro libro1 = new Libro(autor, "100Millas", 19.99f);
        System.out.println("El libro 1 es:");
        System.out.println(libro1.toString());

        System.out.println("--------------------");

        // Creamos una instancia de película
        Pelicula pelicula1 = new Pelicula(protagonista, director, "Inception", 12.99f);
        System.out.println("La pelicula 1 es:");
        System.out.println(pelicula1.toString());

        System.out.println("--------------------");

        // Probar método esIgual
        Persona otraPersona = new Persona("Daniel", "Martínez");
        System.out.println("El autor de la película 1 es igual a otraPersona? " + autor.esIgual(otraPersona));
    }
}
