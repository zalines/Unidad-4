import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int nsecreto= 241; int num;

    System.out.println("Adivina cual es el numero secreto: ");
    num= sc.nextInt();

    if(num == nsecreto){
        System.out.println("Correcto!");
    }
    else{
        System.out.println("Respuesta Incorrecta, intentelo denuevo");
    }
    sc.close();

    System.out.println("Buenos dias");
}
}
