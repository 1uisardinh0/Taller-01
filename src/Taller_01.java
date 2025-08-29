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

        while (true){
            System.out.println("""
                    ---Bienvenido al menu del programa---
                    
                        1. Verificar Revés-Derecho.
                        2. Contar vocales de una frase.
                        3. Encriptar una frase.
                        4. Desencriptar una frase.
                        5. Salir.
                        
                    Elija una opcion: """);

            String opcion =  entrada.nextLine();

            switch(opcion){
                case "1": verificarRevezDerecho();
                    break;

                case "2": contarVocales();
                    break;

                case "3": encriptarFrase();
                    break;

                case "4": desencriptarFrase();
                    break;

                case "5": break;

            }

        }
    }

    public static void verificarRevezDerecho(){
        System.out.println("Hola esto funciona");
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
