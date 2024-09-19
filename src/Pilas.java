import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {

        //crear pila de enteros
        Stack<Integer> pila = new Stack<>();

        System.out.println("Lista vacía: " + pila); //Imprime la lista vacía, debe mostrar []
        System.out.println("¿Está vacía? " + pila.isEmpty()); //Verifica si la pila está vacía, salida true

        //Agreagamos elementos a la pila

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        for (Integer pilita: pila) {
            System.out.println(pilita);

        }
            System.out.println("Pila: " + pila);
            System.out.println("¿Pila vacía? " + pila.isEmpty());

//            pila.pop();


            System.out.println("¿Está el número 1? " + pila.search(1));

        System.out.println("Último agregado: " + pila.peek());
        }
    }

