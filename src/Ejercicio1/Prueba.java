package Ejercicio1;

/*1.- Implementa las siguientes clases:

-> clase Nota. Una nota contiene un identificador numérico y una línea de texto. Define constructor, accedentes,
mutadores y toString. ----> // TODO Esto Ok

-> clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma. Define constructor, accedentes,
mutadores y toString.----> // TODO Esto Ok

-> clase BlocNotas que modela un bloc de notas en el que se pueden introducir notas, listar todas las notas,
eliminar una nota mediante su posición en el bloc de notas o saber cuántas notas contiene el bloc de notas.

Utiliza un Array.

-> clase Prueba que cree un bloc de Notas de ejemplo y pruebe las operaciones que soporta.
*/

public class Prueba {

    public static void main(String[] args) {
        
      
        BlocNotas bloc = new BlocNotas(10);
        
        Nota nota1 = new Nota(1, "Nota 1");
        Nota nota2 = new Nota(2, "Nota 2");
        
        bloc.introducirNota(nota1);
        bloc.introducirNota(nota2);
        
        //Listamos todas las notas
        System.out.println("-----Listamos notas---------");
        bloc.listarNotas();
        
        System.out.println("");
        
        // Eliminamos una nota
        System.out.println("-------Eliminamos nota 0 y listamos de nuevo--------");
        bloc.eliminarNota(0);
        bloc.listarNotas();
        System.out.println("---------------");
        
        System.out.println("");
        
        // Añadimos notas
        System.out.println("-------Añadimos nuevas notas 3, 4 y 5, listamos--------");
        bloc.introducirNota(new Nota(3, "Nota 3"));
        bloc.introducirNota(new Nota(4, "Nota 4"));
        bloc.introducirNota(new Nota(5, "Nota 5"));
        bloc.listarNotas();
        System.out.println("---------------");

        System.out.println("");

        System.out.println("-------Añadimos nota de alarma y listamos--------");
        NotaAlarma notaConAlarma = new NotaAlarma(6, "Esto es una alarma", "12:50h");
        bloc.introducirNota(notaConAlarma);


        // listamos cambios
        bloc.listarNotas();
        
        System.out.println("---------------");
        
        System.out.println("");
        
        System.out.println("-------Cantidad final de notas--------");
        System.out.println("Cantidad de notas: " + bloc.cantidadNotas());
    }
}
