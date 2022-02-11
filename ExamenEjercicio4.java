import java.util.*;

public class ExamenEjercicio4 {
    public static void main(String[] args) {
        
        Scanner inputKey = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("=      1.- FORMULA 1     =");
        System.out.println("=      2.- FORMULA 2     =");
        System.out.println("=      3.- FORMULA 3     =");
        System.out.println("=      3.- FORMULA 4     =");
        System.out.println("==========================");
        System.out.print("La opción a escoger es: ");
        int opcSelect = inputKey.nextInt();

        if(opcSelect == 1) {
            System.out.println("Ingrese el valor de W:");
            float valorW1 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de X");
            float valorX1 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de Y:");
            int valorY1 = inputKey.nextInt();
            System.out.println("Ingrese el valor de Z:");
            int valorZ1 = inputKey.nextInt();
            double resultFormulaOne = FormulaOne(valorW1, valorX1, valorY1, valorZ1);
            System.out.println("El resultado es: " + resultFormulaOne);
        }

        if(opcSelect == 2) {
            FormulaSecond();
        }

        if(opcSelect == 3) {
            System.out.println("Ingrese el valor de W:");
            float valorW3 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de X");
            float valorX3 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de Y:");
            int valorY3 = inputKey.nextInt();
            System.out.println("Ingrese el valor de Z:");
            int valorZ3 = inputKey.nextInt();
            double resultFormulaThree = FormulaThree(valorW3, valorX3, valorY3, valorZ3);
            System.out.println("El resultado es: " + resultFormulaThree);
        }

        if(opcSelect == 4) {
            System.out.println("Ingrese el valor de W:");
            float valorW4 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de X");
            float valorX4 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de Y:");
            int valorY4 = inputKey.nextInt();
            System.out.println("Ingrese el valor de Z:");
            int valorZ4 = inputKey.nextInt();
            double resultFormulaFour = FormulaFour(valorW4, valorX4, valorY4, valorZ4);
            System.out.println("El resultado es: " + resultFormulaFour);
        }

    }


    static double FormulaOne(float w, float x, int y, int z) {
        return (x+Math.pow(y, 2)*Math.pow(z, 2) + Math.sqrt(w));
    }

    static void FormulaSecond(){
            Scanner inputKey = new Scanner(System.in);
            System.out.println("Ingrese el valor de W:");
            float valorW2 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de X");
            float valorX2 = inputKey.nextFloat();
            System.out.println("Ingrese el valor de Y:");
            int valorY2 = inputKey.nextInt();
            System.out.println("Ingrese el valor de Z:");
            int valorZ2 = inputKey.nextInt();
            double resultFormulaSecond = ((Math.pow(valorW2, 2) + Math.pow(valorX2, 3)) * (Math.pow(valorY2, 2) + Math.pow(valorZ2, 3)));
            System.out.println("El resultado es: " + resultFormulaSecond);
    }

    static double FormulaThree(float w, float x, int y, int z) {
        double pSuma = 0;
        double arrayPromedio[]={w,x,y,z};
        int pResult = arrayPromedio.length;
        for (int i=0; i<pResult;i++){
            pSuma = pSuma+arrayPromedio[i];
        }
            double pSuma2 = pSuma/pResult;
        return pSuma2;

    }

    static double FormulaFour(float w, float x, int y, int z) {
        double rs = Math.sqrt(w*z) + Math.sqrt(x+2) + Math.sqrt(y-5);
        return rs;
    }

}
