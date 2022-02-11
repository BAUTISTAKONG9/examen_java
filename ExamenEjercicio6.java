import java.util.Scanner;

public class ExamenEjercicio6 {
    public static void main(String[] args) {
        Scanner inputKey = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("=      1.- METODO 1     =");
        System.out.println("=      2.- FORMULA 2     =");
        System.out.println("=      3.- FORMULA 3     =");
        System.out.println("=      4.- FORMULA 4     =");
        System.out.println("=      5.- FORMULA 5     =");
        System.out.println("==========================");
        System.out.print("La opción a escoger es: ");
        int opcSelect = inputKey.nextInt();

        if (opcSelect == 1) {
            System.out.println("Ingrese el valor de A:");
            float valorA1 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de B");
            float valorB1 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de C:");
            int valorC1 = inputKey.nextInt();
            System.out.println("Ingrese el valor de D:");
            int valorD1 = inputKey.nextInt();
            System.out.println("Ingrese el valor de E:");
            int valorE1 = inputKey.nextInt();

            float resultMethodOne = MethodOne(valorA1, valorB1, valorC1, valorD1, valorE1);
            System.out.println("El promedio de todos los valores es de : " + resultMethodOne);
        }

        if (opcSelect == 2) {
            FormulaSecond();
        }

        if (opcSelect == 3) {
            System.out.println("Ingrese el valor de A:");
            float valorA3 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de B");
            float valorB3 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de C:");
            int valorC3 = inputKey.nextInt();
            System.out.println("Ingrese el valor de D:");
            int valorD3 = inputKey.nextInt();
            System.out.println("Ingrese el valor de E:");
            int valorE3 = inputKey.nextInt();

            float resultFormulaThree = FormulaThree(valorA3, valorB3, valorC3, valorD3, valorE3);
            System.out.println("El Resultado es : " + resultFormulaThree);

        }

        if (opcSelect == 4) {
            FormulaFour();
        }

        if (opcSelect == 5) {
            System.out.println("Ingrese el valor de A:");
            float valorA5 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de B");
            float valorB5 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de C:");
            int valorC5 = inputKey.nextInt();
            System.out.println("Ingrese el valor de D:");
            int valorD5 = inputKey.nextInt();
            System.out.println("Ingrese el valor de E:");
            int valorE5 = inputKey.nextInt();

            float resultFormulaFive = FormulaFive(valorA5, valorB5, valorC5, valorD5, valorE5);
            System.out.println("El Resultado es : " + resultFormulaFive);
        }
    }

    private static float MethodOne(float a, float b, int c, int d, int e) {
        double pSuma = 0;
        double arrayPromedio[] = { a, b, c, d, e };
        int pResult = arrayPromedio.length;
        for (int i = 0; i < pResult; i++) {
            pSuma = pSuma + arrayPromedio[i];
        }
        double pSuma2 = pSuma / pResult;
        return (float) pSuma2;
    }

    static void FormulaSecond() {
        Scanner inputKey = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        float valorA2 = inputKey.nextFloat();
        System.out.println("Ingrese el valor de B");
        float valorB2 = inputKey.nextFloat();
        System.out.println("Ingrese el valor de C:");
        int valorC2 = inputKey.nextInt();
        System.out.println("Ingrese el valor de D:");
        int valorD2 = inputKey.nextInt();
        System.out.println("Ingrese el valor de E:");
        int valorE2 = inputKey.nextInt();

        double resultFormulaSecond = (Math.pow(valorA2, 2) + Math.pow(valorC2, 2) * Math.pow(valorB2, 5) + Math.sqrt(valorE2*valorD2));
        System.out.println("El resultado es: " + resultFormulaSecond);
    }

    static float FormulaThree(float a, float b, int c, int d, int e) {

        float result_formulathree = (float) (Math.sqrt(e) * (Math.pow(b,3) + Math.pow(a, 3)) + (Math.pow(b,5) + Math.pow(c, 3)));

        return result_formulathree;

    }

    static void FormulaFour(){
        Scanner inputKey = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        float valorA4 = inputKey.nextFloat();
        System.out.println("Ingrese el valor de B");
        float valorC4 = inputKey.nextFloat();

        System.out.println("Resultado: Seno(C): " + Math.sin(valorC4) + " Coseno(A): " + Math.cos(valorA4));
    }

    static float FormulaFive(float a, float b, int c, int d, int e) {
        float resultFormulaFiveReturn = (float) ((Math.sqrt(a+5)) + (Math.sqrt(c)) + (Math.sqrt(b)) + (Math.sqrt(d-e)));
        return resultFormulaFiveReturn;
    }

}
