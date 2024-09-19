import java.util.LinkedList;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<>();

        System.out.println("Lista vacía: " + cola);
        System.out.println("¿Está vacía? " + cola.isEmpty());

        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        cola.add(5);

        for (Integer elemento: cola) {
            System.out.println(elemento);
        }

        System.out.println("Cola: " + cola);
        System.out.println("¿Cola vacía? " + cola.isEmpty());

        cola.poll();

        System.out.println("Primer elemento: " + cola.peek());

    }
}
