import java.util.Scanner;

public class funcionArray_03_mejorado {

    // Crear una funcion que nos devuelva un array de un rango de numeros que introduzcamos
    // ambos incluidos y en el orden introducido.

    public static void main(String[] args) {
        // Dejamos comentado la forma de comprobar el programa y añadimos la opción
        // de introducir tu ambos valores del rango

        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce el primer valor: ");
        int num1 = sn.nextInt();
        System.out.println("Introduce el segundo valor: ");
        int num2 = sn.nextInt();
        System.out.println("Este es tu rango: ");
        mostrar(serie(num1,num2));

        /*int [] arr1 = serie(5, -7);
        int [] arr2 = serie(7, 5);
        int [] arr3 = serie(5, 5);

        System.out.println("arr1");
        mostrar(arr1);
        System.out.println("arr2");
        mostrar(arr2);
        System.out.println("arr3");
        mostrar(arr3);*/

    } // Creamos la funcion con un bucle if y un else para que detecte cual es el valor
    // mayor y menor y actúe en corcondancia
    public static int [] serie (int ini, int fin) {

        int dimension = Math.abs(ini - fin) + 1;
        int [] serie = new int[dimension];

        if (ini < fin) {

            for (int i = 0, j = ini; i < serie.length; i++, j++){
                serie[i] = j;
            }

        }else {
            for (int i = 0, j = ini; i < serie.length; i++, j--) {
                serie[i] = j;
            }

        } return serie;

    } // Creamos una funcion para mostrar el recorrido del array
    public static void mostrar (int [] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
