import java.util.Scanner;

public class funcionArray_02_mejorado {
    // Crear una funcion que nos devuelva la suma de un array y otra que nos devuelva la media
    // En vez de funcionar con un array escrito, he incluido un scanner y un bucle for para seleccionar
    // la longitud del array y el contenido del mismo.
    // Mas adelante creo otro bucle for para mostrar el contenido del mismo antes de realizar las
    // operaciones con las funciones creadas en el ejercicio
    // Añadimos dos funciones para determinar el valor maximo y el valor mínimo del array

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Introduce la longitud del array");
        int length = sn.nextInt();
        int [] number = new int[length];

        // int [] number = {1, 2, 3, 4, 5};

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                System.out.println("Introduce el numero para la posición "+ i +" para el array: ");
                number[i] = sn.nextInt();
            }else if (i == 1){
                System.out.println("Introduce el numero para la posición "+ i +" para el array: ");
                number[i] = sn.nextInt();
            }else if (i == 2){
                System.out.println("Introduce el numero para la posición "+ i +" para el array: ");
                number[i] = sn.nextInt();
            }else if (i == 3){
                System.out.println("Introduce el numero para la posición "+ i +" para el array: ");
                number[i] = sn.nextInt();
            }else if (i == 4){
                System.out.println("Introduce el numero para la posición "+ i +" para el array: ");
                number[i] = sn.nextInt();
            }else if (i == 5){
                System.out.println("Introduce el numero para la posición "+ i +" para el array: ");
                number[i] = sn.nextInt();
            }else if (i == 6){
                System.out.println("Introduce el numero para la posición "+ i +" para el array: ");
                number[i] = sn.nextInt();
            }
        }
        System.out.print("El array es: ");

        for (int f = 0; f < length; f++) {
            System.out.print(number[f]);
            System.out.print(" ");
        }
        System.out.println(" ");
        System.out.println("La suma es: "+suma(number));
        System.out.println("La media es: "+media(number));
        System.out.println("El valor máximo es: "+max(number));
        System.out.println("El valor mínimo es: "+min(number));
    }
    public static int suma (int [] numeros ) {
        int suma = 0;
        for (int i = 0; i < numeros.length ; i++){
            suma += numeros[i];
        }
        return suma;
    }
    public static double media (int [] numeros) {

        int suma = suma(numeros);

        return suma / numeros.length;
    }
    public static int max (int [] numeros) {
        int max;
        max = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>max) {
                max = numeros[i];
            }
        }
        return max;
    }
    public static int min (int [] numeros) {
        int min;
        min = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<min) {
                min = numeros[i];
            }
        }
        return min;
    }
}
