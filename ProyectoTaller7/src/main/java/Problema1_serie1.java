/***
 * Problema 1
 *Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 1/10, 2/11, 3/12, 4/13, 5/14, 6/15
 * @author Hans
 */

import java.util.Scanner;

public class Problema1_serie1 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 1, limite;
        System.out.print("Dame el limite: ");
        limite = tcl.nextInt();
        while(contador <= limite){
            System.out.print(contador + "/" + (contador + 9) + ", " );
            contador++;
        }
        System.out.println("");
    }
}
/***
 * run 
 * Dame el limite: 2
 *1/10, 2/11,
 */