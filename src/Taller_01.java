import java.util.Scanner;

public class Taller_01 {
    public static void main(String[] args) {
        menu();
    }

    //Muestras las opciones del programa y controla el flujo de este.
    public static void menu(){

        Scanner entrada = new Scanner(System.in);
        int opcion;
        boolean salir = false;

        do {
            System.out.println("""
                    Bienvenido al menu del programa
                    
                        1. Verificar Revés-Derecho.
                        2. Contar vocales de una frase.
                        3. Encriptar una frase.
                        4. Desencriptar una frase.
                        5. Salir.

                    Elija una opcion:""");

            opcion =  entrada.nextInt();

            switch(opcion) {
                case 1 -> verificarRevezDerecho();
                case 2 -> contarVocales();
                case 3 -> encriptarFrase();
                case 4 -> desencriptarFrase();
                case 5 -> salir = true;
                default -> System.out.println("Opcion invalida. Intente nuevamente.");
            }
        }
        while (!salir);
        System.out.println("Saliedo del programa. ");
        entrada.close();
    }

    //Metodo que nos permite verificar si una frase es revéz-derecho.
    public static void verificarRevezDerecho(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba su frase: ");
        String frase = entrada.nextLine().toLowerCase().replaceAll("\\s", "");
        StringBuilder convertidor = new StringBuilder(frase);
        String textoIvertido = convertidor.reverse().toString();

        if (textoIvertido.equals(frase)){
            System.out.println("La frase es Revéz-Derecho");
        }
        else{
            System.out.println("La frase no es Revez-Derecho");
        }
    }

    //Metodo que permite contar las vocales de una frase.
    public static void contarVocales(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escriba su frase: ");
        String frase = entrada.nextLine().toLowerCase().replaceAll("\\s", "");
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if  (frase.charAt(i) == 'a'){
                contador++;
            }
            else if  (frase.charAt(i) == 'e'){
                contador++;
            }
            else if  (frase.charAt(i) == 'i'){
                contador++;
            }
            else if  (frase.charAt(i) == 'o'){
                contador++;
            }
            else if  (frase.charAt(i) == 'u'){
                contador++;
            }
        }
        System.out.println("La frase tiene: " +  contador + " Vocales");
    }

    public static void encriptarFrase(){
        System.out.println("Hola esto funciona");
    }

    public static void desencriptarFrase(){
        System.out.println("Hola esto funciona");

    }
}
