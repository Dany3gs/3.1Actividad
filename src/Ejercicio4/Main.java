package Ejercicio4;

/*4.- Vamos a generalizar las clases Libro y Película del ejercicio anterior.

Como nos podemos dar cuenta, las clases Libro y Película tienen dos atributos en común: título y precio. Entonces,
podemos considerar una generalización de estas dos clases para crear la superclase:

-> Producto, cuyos atributos son el título y el precio de un producto, de tipo String y Float, respectivamente.
Generalmente, los productos están relacionados con un identificador único, por lo tánto está clase también tiene el
atributo id de tipo Integer.

Crear producto como una clase abstracta.

De esta forma, ahora las clases Libro y Película son subclases de Producto y deben heredar de esta sus atributos y
métodos. Además, dado que los productos se van a vender, es necesario contar con un catálogo que los clientes puedan
revisar. Por esta razón, se considera la clase:

-> Catálogo, que cuenta con un atributo productos, que contiene a los libros y películas en venta (por ejemplo, un
arreglo suficientemente grande de Productos), y con otro para conocer la cantidad de productos que están disponibles.

Todas las clases anteriores consideran sus respectivos constructores, métodos getters y setters y el método toString().

Adicionalmente, la clase Catálogo considera los siguientes métodos:

--> agregar(Producto p), agrega el Producto p al catálogo.
--> eliminar(Integer id), elimina el producto cuyo identificador único es id.
--> buscar(String titulo), devuelve, contenidos en un Catálogo, a todos los Productos cuyo título es titulo.
--> buscar(Persona p), devuelve, contenidos en un Catálogo, a todos los Productos cuyo autor, director o protagonista,
según sea el caso, es p.

Implementa las clases Persona, Libro y Catálogo, considerando los atributos, constructores y métodos descritos.
*/

public class Main {
}
