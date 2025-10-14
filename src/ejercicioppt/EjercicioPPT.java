package ejercicioppt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crear una clase que implemente Comparable<Producto> para poder ordenarlos 
 * por precio usando Collections.sort();
 */
public class EjercicioPPT {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        
        productos.add(new Producto("Mouse", 2500.00));
        productos.add(new Producto("Teclado", 5500.00));
        productos.add(new Producto("Monitor", 35000.00));
        productos.add(new Producto("Parlantes", 5000.00));
        
        System.out.println("Antes de ordenar:");
        for (Producto p : productos) {
            System.out.println(p);
        }
        //System.out.println(productos);
        Collections.sort(productos);
        
//        System.out.println("Despues de ordenar:");
//        for (Producto p : productos) {
//            System.out.println(p);
//        }
        System.out.println(productos);
    }
    
}
