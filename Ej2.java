import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    float nota;

    System.out.println("Introduce nota: ");
    nota= sc.nextFloat();

    if(nota >= 0 && nota < 5){
        System.out.print("Suspendido");
    }

    else if(nota >= 5 && nota < 6.5){
        System.out.print("Aprobado");
    }

    else if(nota >= 6.5 && nota < 9){
        System.out.print("Notable");
    }

    else if(nota >= 9 && nota <= 10){
        System.out.print("Excelente");
    }

    else{
        System.out.print("Error");
    }
    sc.close();
    }
    
}
