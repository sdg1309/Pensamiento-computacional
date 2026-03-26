import java.util.ArrayList;
import java.util.Iterator;

public class arrayList_explic {
    // Arreglos dinamicos con array list
    // Este archivo es una lista chiquita de los posibles metodos necesarios y
    // utiles

    public static void main(String[] args) {
        // Se declara como:
        // ArrayList<tipo de dato> Nombre = new ArrayList<tipo de dato>();

        ArrayList<Integer> array = new ArrayList<Integer>();

        // METODOS:
        // para apend algun elemento en el arra usamos .add(elemento)
        array.add(4);

        // para obtener algun elemento en espesifico usamos .get(posicion)
        array.get(0);

        // para modificar un elemento en especifico usamos .set(posicion, elemento)
        array.set(0, 9);

        // para eliminarun elemento en especifico usamos .remove(posicion)
        array.remove(0);

        // para eliminar todo el array, y dejarlo en nulo usamos .clear()
        array.clear();

        // para ver cuantos elementos tiene el array list usamos .size()
        array.size();

        // loop en un arrayList
        // Usando .foreach((index) -> {ejecutable})
        array.forEach((n) -> {
            System.out.println(n);
        });

        // Con Iteradores, hay que importar java.util.Iterator para que funcione
        // Creas en iterador como:
        // Iterator<Tipo de dato> nombre del iterador = array.iterator();

        // Get the iterator
        Iterator<Integer> it = array.iterator();

        // Loop through a collection
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

// https://www.w3schools.com/java/java_ref_arraylist.asp
