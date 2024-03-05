import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList lista = new LinkedList();

        int opcion;
        do {
            System.out.println("\nLista Enlazada");
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Recorrer");
            System.out.println("4. Buscar elemento");
            System.out.println("5. Borrar un elemento");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a insertar al inicio: ");
                    int datoInicio = scanner.nextInt();
                    lista.insertarAlInicio(datoInicio);
                    break;
                case 2:
                    System.out.print("Ingrese el elemento a insertar al final: ");
                    int datoFinal = scanner.nextInt();
                    lista.insertarAlFinal(datoFinal);
                    break;
                case 3:
                    System.out.println("Elementos en la lista:");
                    lista.recorrer();
                    break;
                case 4:
                    System.out.print("Ingrese el elemento a buscar: ");
                    int elementoBuscado = scanner.nextInt();
                    if (lista.buscarElemento(elementoBuscado)) {
                        System.out.println("El elemento " + elementoBuscado + " está en la lista.");
                    } else {
                        System.out.println("El elemento " + elementoBuscado + " no está en la lista.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el elemento a borrar: ");
                    int elementoBorrar = scanner.nextInt();
                    lista.borrarElemento(elementoBorrar);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
