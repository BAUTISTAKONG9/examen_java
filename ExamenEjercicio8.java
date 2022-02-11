import java.util.Scanner;

public class ExamenEjercicio8 {
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
            System.out.print("Ingrese la base a ser potenciado con el mismo valor: ");
            int varData1 = inputKey.nextInt();
            int resultpoten = (int) Math.pow(varData1, varData1);
            System.out.println("El resultado es: " + resultpoten);
        }

        if(opcSelect == 2) {
            System.out.print("Ingrese el valor de W: ");
            int varData2_1 = inputKey.nextInt();
            System.out.print("Ingrese el valor de X: ");
            int varData2_2 = inputKey.nextInt();
            System.out.print("Ingrese el valor de Y: ");
            double varData2_3 = inputKey.nextDouble();
            System.out.print("Ingrese el valor de Z: ");
            double varData2_4 = inputKey.nextDouble();

            double resultMethodSecond = (Math.pow(varData2_1, 2)  + Math.pow(varData2_2, 3)) * (Math.pow(varData2_3, 2) + Math.pow(varData2_4, 3));
            System.out.println("El resultado es : " + resultMethodSecond);
        }

        if(opcSelect == 3) {
            System.out.print("Ingrese el valor 1: ");
            int varData3_1 = inputKey.nextInt();
            System.out.print("Ingrese el valor 2: ");
            int varData3_2 = inputKey.nextInt();
            System.out.print("Ingrese el valor 3: ");
            double varData3_3 = inputKey.nextDouble();
            System.out.print("Ingrese el valor 4: ");
            double varData3_4 = inputKey.nextDouble();

            double pSuma = 0;
            double arrayPromedio[] = { varData3_1, varData3_2, varData3_3, varData3_4};
            int pResult = arrayPromedio.length;
            for (int i = 0; i < pResult; i++) {
                pSuma = pSuma + arrayPromedio[i];
            }
            double pSuma2 = pSuma / pResult;
            System.out.println("El promedio de todos los valores es : " + pSuma2);
        }

        if(opcSelect == 4) {
            System.out.print("Ingrese el valor de W: ");
            int varData4_1 = inputKey.nextInt();
            System.out.print("Ingrese el valor de X: ");
            int varData4_2 = inputKey.nextInt();
            System.out.print("Ingrese el valor de Y: ");
            int varData4_3 = inputKey.nextInt();
            System.out.print("Ingrese el valor de Z: ");
            int varData4_4 = inputKey.nextInt();

            double resultFormulaFour = Math.sqrt(varData4_1) + Math.sqrt(varData4_2) + Math.sqrt(varData4_3) + Math.sqrt(varData4_4);
            System.out.println("El resultado es : " + resultFormulaFour);
        }
    }
}
