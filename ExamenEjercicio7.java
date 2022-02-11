import java.util.Scanner;

public class ExamenEjercicio7 {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("=      1.- METODO 1     =");
        System.out.println("=      2.- METODO 2     =");
        System.out.println("=      3.- METODO 3     =");
        System.out.println("=      4.- METODO 4     =");
        System.out.println("==========================");
        System.out.print("La opción a escoger es: ");
        int opcSelect = inputKey.nextInt();


        if(opcSelect == 1) {
            System.out.println("Ingrese un valor para obtener la raiz cuadrada");
            int varRC = inputKey.nextInt();
            double resultRC = (double) Math.sqrt(varRC);
            System.out.println("El resultado es: " + resultRC);
        }
        if(opcSelect == 2) {
            System.out.println("Ingrese el primer valor: ");
            int varData1 = inputKey.nextInt();
            System.out.println("Ingrese el primer valor: ");
            int varData2 = inputKey.nextInt();
            int resultpoten = (int) Math.pow(varData1, varData2);
            System.out.println("El resultado es: " + resultpoten);
        }
        if(opcSelect == 3) {
            System.out.println("Ingrese el valor de X");
            int varX1 = inputKey.nextInt();
            System.out.println("Ingrese el valor de Y");
            int varY1 = inputKey.nextInt();
            double resultFormulaThree = (Math.pow(varX1, 2) + Math.pow(varY1, 3));
            System.out.println("El resultado es: " + resultFormulaThree);
        }
        if(opcSelect == 4) {
            System.out.println("Ingrese el valor de X");
            int varX2 = inputKey.nextInt();
            System.out.println("Ingrese el valor de Y");
            int varY2 = inputKey.nextInt();
            double resultFormulaFour = Math.sqrt((Math.pow(varX2, 2) + Math.pow(varY2, 3)));
            System.out.println("El resultado es: " + resultFormulaFour);
        }

    }
}
