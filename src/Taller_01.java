import java.util.Locale;
import java.util.Scanner;

public class Taller_01 {
    public static void main(String[] args) {
        menu();
    }

    //Muestra las opciones del menu del programa.
    public static void menu(){
        mostrarMenu();
    }

    public static void mostrarMenu(){

        Scanner entrada = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        do {
            System.out.println("""
                    ---Bienvenido al menu del programa---
                    
                        1. Verificar Revés-Derecho.
                        2. Contar vocales de una frase.
                        3. Encriptar una frase.
                        4. Desencriptar una frase.
                        5. Salir.

                    Elija una opcion:""");

            opcion =  entrada.nextInt();

            switch(opcion) {
                case 1:
                    verificarRevezDerecho();
                    break;
                case 2:
                    contarVocales();
                    break;
                case 3:
                    encriptarFrase();
                    break;
                case 4:
                    desencriptarFrase();
                    break;
                case 5:
                    salir = true;
                    System.out.println("Saliendo del Programa...");
                    break;
                default:
                    System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
        while (!salir);
    }

    public static void verificarRevezDerecho(){
        Scanner entrada = new Scanner(System.in);
        String frase =  entrada.nextLine().toLowerCase();
        StringBuilder convertidor = new StringBuilder(frase);
        String textoIvertido = convertidor.reverse().toString();

        if (textoIvertido.equals(frase)){
            System.out.println("La frase es Revéz-Derecho");
            boolean revezDerecho = true;
            contarVocales();
        }
        else{
            boolean revezDerecho = false;
            System.out.println("La frase no es Revez-Derecho");
        }

    }

    public static void contarVocales(){
        System.out.println("Hola esto funciona");
    }

    public static void encriptarFrase(){
        System.out.println("Hola esto funciona");
    }

    public static void desencriptarFrase(){
        System.out.println("Hola esto funciona");

    }
}
