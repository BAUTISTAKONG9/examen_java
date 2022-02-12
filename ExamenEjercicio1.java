import java.util.*;

public class ExamenEjercicio1 {

    public static void main(String[] args) {

        Scanner KeyInput = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("=     1.- Area Circulo   =");
        System.out.println("=    2.- Area Cuadrado   =");
        System.out.println("=   3.- Area triángulo   =");
        System.out.println("=   4.- Area rectángulo  =");
        System.out.println("==========================");

        System.out.print("Ingrese la opción: ");
        int menuSelectData = KeyInput.nextInt();


        if( ==OPCIONES 1) {
            double pi = 3.1416;
            System.out.print("Ingrese el valor de la radio del circulo: ");
            int radio = KeyInput.nextInt();
            double areaCirculo = pi * Math.pow(radio, 2);
            System.out.println("El area del circulo es: " + areaCirculo);
        }

        
        if( == OPCIONES 2) {
            System.out.print("Ingrese el lado del cuadrado: ");
            int ladoCuadrado = KeyInput.nextInt();
            int areaCuadrado = ladoCuadrado * ladoCuadrado;
            System.out.println("El area del cuadrado es: " + areaCuadrado);
        }

        
        if( ==OPCIONES 3) {
            System.out.print("Ingrese el base del triangulo: ");
            int b = KeyInput.nextInt();
            System.out.print("Ingrese la altura del triangulo: ");
            int h = KeyInput.nextInt();
            int areaTriangulo = (b * h) / 2;
            System.out.println("El area del triangulo es: " + areaTriangulo);
        }

        
        if( ==OPCIONES 4) {
            System.out.print("Ingrese la base del rectangulo: ");
            int b = KeyInput.nextInt();
            System.out.print("Ingrese la altura del rectangulo: ");
            int h = KeyInput.nextInt();
            int areaRectangulo = b * h;
            System.out.println("El area del cuadrado es: " + areaRectangulo);
        }

    }
}
