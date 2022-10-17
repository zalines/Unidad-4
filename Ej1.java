import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Estos son las variables */

    int nsecreto= 241; int num;

    /*Esto es lo que va salir en pantalla*/

    System.out.println("Adivina cual es el numero secreto: ");
    num= sc.nextInt();

/*condiciones*/

    if(num == nsecreto){
        System.out.println("Correcto!");
    }
    else{
        System.out.println("Respuesta Incorrecta, intentelo denuevo");
    }

    /*cerrar Scanner */
    sc.close();

}
}
