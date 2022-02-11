import java.util.*;

public class ExamenEjercicio5 {
    private static int resultCaracter;

    public static void main(String[] args) {
        
        Scanner inputKey = new Scanner(System.in);



        
        System.out.println("==========================");
        System.out.println("=      1.- METODO 1     =");
        System.out.println("=      2.- METODO 2     =");
        System.out.println("=      3.- METODO 3     =");
        System.out.println("=      3.- METODO 4     =");
        System.out.println("=      3.- METODO 5     =");
        System.out.println("==========================");
        System.out.print("La opción a escoger es: ");
        int opcSelect = inputKey.nextInt();



        if(opcSelect == 1){
            MethodOne();
        }
        if(opcSelect == 2){
            MethodSecond();
        }
        if(opcSelect == 3){
            MethodThree();
        }
        if(opcSelect == 4){
            MethodFour();
        }
        if(opcSelect == 5){
            MethodFive();
        }
    }

    static void MethodOne() {
        Scanner inputKey = new Scanner(System.in);
        System.out.print("Ingrese la palabra : ");
        String data = inputKey.next();

        int result_data = data.length();
        for(int i = 1; i<=result_data; i++) {
            resultCaracter = resultCaracter + i;
        }

        System.out.println("La palabra " + data + " contiene " + result_data + " caracteres" + " y la suma es : " + resultCaracter);
    }

    static void MethodSecond() {
        Scanner inputKey = new Scanner(System.in);
        System.out.print("Ingrese la palabra : ");
        String data = inputKey.next();

        char textInicio = data.toLowerCase().charAt(0);
        char[] textFinal = data.toLowerCase().toCharArray();
        System.out.println("Resultado: " + textInicio + " - " + textFinal[textFinal.length - 1]);
    }

    static void MethodThree() {
        StringBuilder builder = new StringBuilder();
        Scanner inputKey = new Scanner(System.in);
        System.out.print("Ingrese la palabra a contar : ");
        String data = inputKey.next();
        String[] palabras = data.split(" ");
        for (String palabra : palabras) {
            if (palabra.length() >= 3) {
                builder.append(palabra.substring(0, 3));
            } else {
                builder.append(palabra);
            }
        }
        System.out.println(builder.toString());
    }

    static void MethodFour() {
        Scanner inputKey = new Scanner(System.in);
        System.out.print("Ingrese el nombre a convertir a mayusculas: ");
        String dataMin = inputKey.next();
        System.out.println(dataMin.toUpperCase());
    }

    static void MethodFive() {
        Scanner inputKey = new Scanner(System.in);
        System.out.print("Ingrese el nombre a convertir a minusculas: ");
        String dataMin = inputKey.next();
        System.out.println(dataMin.toLowerCase());

    }
}
