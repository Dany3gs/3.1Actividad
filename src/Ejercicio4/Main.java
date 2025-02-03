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
	public static void main(String[] args) {

		Persona4 persona1 = new Persona4("Daniel", "Martinez");
		Persona4 persona2 = new Persona4("Juan", "Martinez");
		Persona4 persona3 = new Persona4("Pedro", "Martinez");

		Libro libro1 = new Libro("100Millas", 10, persona1);
		Libro libro2 = new Libro("200Millas", 20, persona2);
		Libro libro3 = new Libro("300Millas", 30, persona3);
		Libro libro4 = new Libro("300Millas", 30, persona3);

		Pelicula pelicula1 = new Pelicula("400Millas", 20,persona1,persona2);
		Pelicula pelicula2 = new Pelicula("2000Millas", 14,persona3,persona2);
		Pelicula pelicula3 = new Pelicula("300Millas", 22,persona2,persona3);

		Catalogo catalogo1 = new Catalogo(6);

		catalogo1.agregar(libro1);
		catalogo1.agregar(libro2);
		catalogo1.agregar(libro3);
		catalogo1.agregar(pelicula1);
		catalogo1.agregar(pelicula2);
		catalogo1.agregar(pelicula3);

		System.out.println("----------Lista de productos----------");
		for(Producto cat : catalogo1.getProductos()){
			System.out.println(cat);
		}
		System.out.println("");

		// Eliminar un producto
		catalogo1.eliminar(2);
		System.out.println("----------Eliminado producto ID 2----------");
		for(Producto cat : catalogo1.getProductos()){
			System.out.println(cat);
		}
		System.out.println("");

		// Buscar por título
		System.out.println("-------------Buscar título 100Millas-------------------");
		System.out.println(catalogo1.buscar("100Millas"));
		System.out.println("");

		// Buscar por persona
		System.out.println("-------------Buscar productos de Daniel Martinez-------------------");
		System.out.println(catalogo1.buscar(persona1));

		// Mostrar cantidad de productos disponibles
		System.out.println("Total de productos disponibles: " + catalogo1.getProductosDisponibles());
	}
}
