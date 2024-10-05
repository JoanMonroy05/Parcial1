import java.util.Scanner;

public class ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto: ");
        String cadenaTexto = scanner.nextLine();

        //Usamo del metodo trim() y replaceAll para eliminar espacios demas
        cadenaTexto = cadenaTexto.trim().replaceAll("\\s+", " ");

        //Uso del metodo split(" ") para dividir la cadena por palabras
        String[] palabras = cadenaTexto.split(" ");

        //Inicializamos una variable contadora
        int contador = 0;
        
        //Realizamos un for-ech para recorre el arreglo
        for(String palabra : palabras){
            contador ++;//Aumentamos el contador por cada palabra
        }
        System.out.println("La cantidad de palabras que tiene su frase: '" + cadenaTexto + "' es: " + contador);

        //Cerramos el scanner
        scanner.close();
    }
}
