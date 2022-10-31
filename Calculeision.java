import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculeision {
    // Se crea un menu de calculadora con distintas funciones
    // y controla si una opcion no esta dentro del rango

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean exit = true;
        int opcion;

        while (exit) {

            System.out.println(" \n ");
            System.out.println("1. Suma \n2. Resta \n3. Multiplicacion \n4. Division " +
                    "\n5. Resto \n6. Potencia \n7. Salir");

            try {

                System.out.print("Introduce la opción: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el primer numero a sumar: ");
                        double numb1 = sn.nextInt();
                        System.out.print("Introduce el segundo numero a sumar: ");
                        double numb2 = sn.nextInt();
                        System.out.println(" ");
                        System.out.print("El resultado es: ");
                        suma(numb1, numb2);
                        break;
                    case 2:
                        System.out.print("Introduce el primer numero a restar: ");
                        double numc1 = sn.nextInt();
                        System.out.print("Introduce el segundo numero a restar: ");
                        double numc2 = sn.nextInt();
                        System.out.println(" ");
                        System.out.print("El resultado es: ");
                        resta(numc1, numc2);
                        break;
                    case 3:
                        System.out.print("Introduce el primer numero a multiplicar: ");
                        int numm1 = sn.nextInt();
                        System.out.print("Introduce el segundo numero a multiplicar: ");
                        int numm2 = sn.nextInt();
                        System.out.println(" ");
                        System.out.print("El resultado es: ");
                        multi(numm1, numm2);
                        break;
                    case 4:
                        System.out.print("Introduce el primer numero numerador: ");
                        double numd1 = sn.nextInt();
                        System.out.print("Introduce el segundo numero denominador: ");
                        double numd2 = sn.nextInt();
                        System.out.println(" ");
                        System.out.print("El resultado es: ");
                        divi(numd1, numd2);
                        break;
                    case 5:
                        System.out.print("Introduce el primer numero numerador: ");
                        double numr1 = sn.nextInt();
                        System.out.print("Introduce el segundo numero denominador: ");
                        double numr2 = sn.nextInt();
                        System.out.println(" ");
                        System.out.print("El resultado es: ");
                        resto(numr1, numr2);
                        break;
                    case 6:
                        System.out.print("Introduce el primer numero a elevar: ");
                        int nump1 = sn.nextInt();
                        System.out.print("Introduce el segundo numero potencia: ");
                        int nump2 = sn.nextInt();
                        System.out.println(" ");
                        System.out.print("El resultado es: ");
                        poten(nump1, nump2);
                        break;
                    case 7:
                        exit = false;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 - 7");

                }
            }catch (InputMismatchException e) {
                System.out.println("Debes introducir un numero");
                sn.next();
            }

        }
        System.out.println("Fin del programa");

    } // A partir de aqui declaro las distintas funciones que he hecho a modo de
     // practica cada una con una operacion diferente
    private static void suma (double num1, double num2){

        System.out.println(num1 + num2);

    }
    private static void resta (double num1, double num2){

        System.out.println(num1 - num2);

    }
    private static void multi (int num1, int num2){

        System.out.println(num1 * num2);

    }
    private static void divi (double num1, double num2){

        System.out.println(num1 / num2);

    }
    private static void resto (double num1, double num2){

        System.out.println(num1 % num2);

    }
    private static void poten (int num1, int num2){

        System.out.println(Math.pow(num1, num2));

    }
}
