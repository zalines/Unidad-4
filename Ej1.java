import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        /*abrimos escaner */
        Scanner sc = new Scanner(System.in);

        /*Estos son las variables */

    int numerosecreto= 241; int numescogido;

    /*Esto es lo que va salir en pantalla*/

    System.out.println("Adivina cual es el numero secreto: ");
    numescogido= sc.nextInt();

/*condiciones*/

    if(numescogido == nsecreto){
        System.out.println("Correcto!");
    }
    else{
        System.out.println("Respuesta Incorrecta, intentelo denuevo");
    }

    /*cerrar Scanner */
    sc.close();

}
}
