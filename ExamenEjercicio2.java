import java.util.*;

public class ExamenEjercicio2 {
    public static void main(String[] args) {


        Scanner KeyInput = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("=   1.- Numeros de Veces =");
        System.out.println("=   2.- Dia Laborables   =");
        System.out.println("=       3.- NPN          =");
        System.out.println("=   4.- Numeros O.MYM    =");
        System.out.println("==========================");

        System.out.print("Ingrese la opción: ");
        int menuSelectData = KeyInput.nextInt();


        if(menuSelectData == 1) {
            System.out.print("Ingrese el primer numero: ");
            int numberOne = KeyInput.nextInt();
            System.out.print("Ingrese el primer numero: ");
            int numberSecond = KeyInput.nextInt();

            while(numberOne < numberSecond) {
                numberOne++;
                System.out.println("El numero es " + numberOne);
            }
        }

        if(menuSelectData == 2) {
            System.out.print("Ingrese el dia de la semana: ");
            int dayWeek = KeyInput.nextInt();
        
            switch(dayWeek){
                case 1:
                    System.out.println("El dia Lunes es Laborable");
                    break;
                case 2:
                    System.out.println("El dia Martes es Laborable");
                    break;
                case 3:
                    System.out.println("El dia Miercoles es Laborable");
                    break;
                case 4:
                    System.out.println("El dia Jueves es Laborable");
                    break;
                case 5:
                    System.out.println("El dia Viernes es Laborable");
                    break;
                case 6:
                    System.out.println("El dia Sabado es Laborable");
                    break;
                case 7:
                    System.out.println("El dia Domingo no es Laborable");
                    break;
                default:
                    System.out.println("Este dia de la semana no existe!!");
                break;
            }
        }

        if(menuSelectData == 3) {
            System.out.print("Ingrese un numero para comprobar: ");
            int numberPNN = KeyInput.nextInt();

            if( numberPNN > 0) {
                System.out.println("El numero " + numberPNN + " es Positivo");
            }

            if( numberPNN < 0) {
                System.out.println("El numero " + numberPNN + " es Negativo");
            }

            if( numberPNN == 0) {
                System.out.println("El numero " + numberPNN + " es Neutro");
            }
            
        }

        if(menuSelectData == 4) {
            System.out.print("Ingrese un numero para comprobar: ");
            int numberCom1 = KeyInput.nextInt();
            System.out.print("Ingrese un numero para comprobar: ");
            int numberCom2 = KeyInput.nextInt();
            System.out.print("Ingrese un numero para comprobar: ");
            int numberCom3 = KeyInput.nextInt();

            if(numberCom1 < numberCom2 && numberCom1 < numberCom3) {
                if(numberCom2 < numberCom3) {
                    System.out.println("El primer numero es: " + numberCom1);
                    System.out.println("El segundo numero es: " + numberCom2);
                    System.out.println("El tercer numero es: " + numberCom3);
                } else if(numberCom3 < numberCom2) {
                    System.out.println("El primer numero es: " + numberCom1);
                    System.out.println("El segundo numero es: " + numberCom2);
                    System.out.println("El tercer numero es: " + numberCom3);
                }
            }

            if(numberCom2 < numberCom1 && numberCom1 < numberCom3) {
                if(numberCom1 > numberCom3) {
                    System.out.println("El primer numero es: " + numberCom2);
                    System.out.println("El segundo numero es: " + numberCom1);
                    System.out.println("El tercer numero es: " + numberCom3);
                } else if(numberCom3 < numberCom1) {
                    System.out.println("El primer numero es: " + numberCom2);
                    System.out.println("El segundo numero es: " + numberCom3);
                    System.out.println("El tercer numero es: " + numberCom1);
                }
            }
            
            if(numberCom3 < numberCom1 && numberCom3 < numberCom2) {
                if(numberCom1 < numberCom2) {
                    System.out.println("El primer numero es: " + numberCom3);
                    System.out.println("El segundo numero es: " + numberCom1);
                    System.out.println("El tercer numero es: " + numberCom2);
                } else if(numberCom2 < numberCom1) {
                    System.out.println("El primer numero es: " + numberCom3);
                    System.out.println("El segundo numero es: " + numberCom2);
                    System.out.println("El tercer numero es: " + numberCom1);
                }
            }

        }
    }
}
