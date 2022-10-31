import java.util.Scanner;

// Programa que recorre una string y devuelve la posicion/es del caracter que indicamos

public class string_06_buclemode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el string a analizar: ");
        String str = sc.nextLine();

        System.out.println("Introduce el caracter a analizar: ");
        String ch = sc.nextLine();

        int index = str.indexOf(ch);

        // Bucle while para recorrer toda la cadena aumentando la posicion de la misma en
        // cada iteración para seguir la busqueda y que no pare en la primera que encuentra
        // el -1 indica el final del string

        while (index != -1) {

            // Nos va mostrando cada similitud que encuentra antes de aumentar el index
            System.out.println(index);

            // Volvemos a guardar en el index para que aumente la posición cada iteración
            index = str.indexOf(ch, index + 1);
        }
    }
}
