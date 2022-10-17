import java.lang.Math;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    int num1; int num2; int opcion;

    System.out.println("Introduce primer valor: ");
    num1 = sc.nextInt();

    System.out.println("Introduce segundo valor: ");
    num2 = sc.nextInt();

    System.out.println(" 1 para sumar");
    System.out.println(" 2 para restar");
    System.out.println(" 3 para multiplicar");
    System.out.println(" 4 para dividir");
    System.out.println(" 5 para potencia");
    System.out.println(" Selecciona una operacion para realizar con los valores anteriores: ");
    opcion = sc.nextInt();

    switch (opcion) {
        case 1:
            System.out.print("La suma entre los dos valores da = " + (num1 + num2));         
            break;
        case 2:
            System.out.print("La resta entre los dos valores da = " + (num1 - num2));
            break;
        case 3:
            System.out.print("La multiplicacion entre los dos valores da = " + num1 * num2);
            break;
        case 4:
            System.out.print("La division entre los dos valores da = " + num1 / num2);
            break;
        case 5:
            System.out.print("La potencia entre los dos valores da = " + Math.pow(num1, num2));
            break;
        default:
            System.out.print("Error, opcion no valida");
    }
    sc.close();
    }
    
}
