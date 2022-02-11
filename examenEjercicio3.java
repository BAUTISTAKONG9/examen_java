import java.util.*;

public class examenEjercicio3 {

    public static void main(String[] args) {

        Scanner inputKey = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("=      1.- FORMULA 1     =");
        System.out.println("=      2.- FORMULA 2     =");
        System.out.println("=      3.- FORMULA 3     =");
        System.out.println("==========================");
        System.out.print("La opción a escoger es: ");
        int opcSelect = inputKey.nextInt();

        if (opcSelect == 1) {
            System.out.println("Ingrese el valor de W:");
            int valorW = inputKey.nextInt();
            System.out.println("Ingrese el valor de X");
            int valorX = inputKey.nextInt();
            System.out.println("Ingrese el valor de Y:");
            int valorY = inputKey.nextInt();
            System.out.println("Ingrese el valor de Z:");
            int valorZ = inputKey.nextInt();
            double ResultFormulaOne = FormulaOne(valorW, valorX, valorY, valorZ);
            System.out.println("El resultado es: " + ResultFormulaOne);
        }

        if (opcSelect == 2) {
            System.out.println("Ingrese el valor de W:");
            int valorW2 = inputKey.nextInt();
            System.out.println("Ingrese el valor de X");
            int valorX2 = inputKey.nextInt();
            System.out.println("Ingrese el valor de Y:");
            int valorY2 = inputKey.nextInt();
            System.out.println("Ingrese el valor de Z:");
            int valorZ2 = inputKey.nextInt();
            double ResultFormulaSecond = FormulaSecond(valorW2, valorX2, valorY2, valorZ2);
            System.out.println("El resultado es: " + ResultFormulaSecond);
        }

        if (opcSelect == 3) {
            FormulaThree();
        }

    }

     static double FormulaOne(int w, int x, int y, int z) {
         return (Math.sqrt(w + x)) + (Math.sqrt(y * z)) - (Math.sqrt(x - y)) + (Math.pow(x, 2));
        }

        static double FormulaSecond(int w, int x, int y, int z) {
         return (Math.pow(x, 2) + Math.pow(y, 3) + Math.pow(z, 5) + Math.sqrt(w + x));
        }

        static void FormulaThree() {
            Scanner inputKey = new Scanner(System.in);
            System.out.println("Ingrese el valor de X");
            int valorX3 = inputKey.nextInt();
            System.out.println("Ingrese el valor de Y:");
            int valorY3 = inputKey.nextInt();
            double resultFormulaThree = Math.sqrt(Math.pow(valorX3,2) + Math.pow(valorY3, 2));
            System.out.println("El resultado es: " + resultFormulaThree);
    }


}
