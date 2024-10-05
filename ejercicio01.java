import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUMERO_DECIMAL = 10;

        System.out.println("Ingrese un numero de las cifras que desee diferente de 0: ");
        int numero = scanner.nextInt();

        //Declaramos un contador
        int contador = 0;

        //Valido que el numero ingresado no sea 0
        if(numero == 0){
            System.out.println("Ingrese un numero diferente de 0");
        }

        //Uso de un ciclo
        while (numero != 0) {
            numero /= NUMERO_DECIMAL;
            contador ++;
        }

        System.out.println("La cantidad de digitos de su numero es: " + contador);

        //Cerramos el scanner
        scanner.close();
    }
}