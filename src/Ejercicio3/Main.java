package Ejercicio3;

/* 3.- En el ejercicio anterior, el atributo autor de Libro y los atributos protagonista y director de Película se
definieron como de tipo String. Dado que estos atributos contienen el nombre de una persona, esta definición puede no
ser homogénea. Por lo tanto, un mejor modelo sería considerar la clase adicional:

-> Persona, cuyos atributos son nombre y apellido, de tipo String. Esta clase, además de contener sus respectivos
métodos getters y setters, considera el método:

-> esIgual(Persona p), que devuelve true si el nombre y apellido de un objeto Persona son iguales a las de la persona
p y false en caso contrario.

De esta forma, las clases Libro y Película se tienen que redefinir como sigue:

-> Libro, cuyos atributos son autor de tipo Persona, título de tipo String y precio de tipo Float.
-> Película, con los atributos protagonista y director de tipo Persona, título de tipo String y precio de tipo Float.

Implementa la clase Persona y la redefinición de las clases Libro y Película, considerando los atributos y métodos
descritos. */

public class Main {
}
