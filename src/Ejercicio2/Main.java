package Ejercicio2;

/*2.- Una persona desea tener una tienda virtual para vender libros y películas en formato blu-ray. Para esto es
necesario, primeramente, representar con un enfoque orientado a objetos, los tipos de productos que se van a vender.

Inicialmente, se están considerando las dos clases siguientes:

-> Libro, que tiene como atributos el autor y el título de tipo String, y el precio de tipo Float.
-> Película, cuyos atributos son el título, el protagonista y el director de tipo String, y el precio de tipo Float.

Las dos clases contienen sus respectivos constructores, métodos getters y setters y el método toString().

Implementa las clases Libro y Película considerando los atributos, constructores y métodos descritos. Además, escribe
una clase principal para crear varios Libros y varias Películas, y saber su título, autor, protagonista, director y
precio, según corresponda.
*/

public class Main {
    public static void main(String[] args) {

        Libro[] libros = new Libro[2];
        libros[0] = new Libro("Gabriel García Márquez", "Cien años de soledad", 10.53f);
        libros[1] = new Libro("George Orwell", "1984", 21.23f);

        Pelicula[] peliculas = new Pelicula[2];
        peliculas[0] = new Pelicula("El Padrino", "Marlon Brando", "Francis Ford Coppola", 19.99f);
        peliculas[1]= new Pelicula("Pulp Fiction", "John Travolta", "Quentin Tarantino", 17.99f);

        System.out.println("-------Libros-------");
        for(Libro libro: libros) {
            System.out.println(libro);
        }
        System.out.println("");
        System.out.println("-------Peliculas-------");
        for(Pelicula pelicula: peliculas) {
            System.out.println(pelicula);
        }
    }
}
