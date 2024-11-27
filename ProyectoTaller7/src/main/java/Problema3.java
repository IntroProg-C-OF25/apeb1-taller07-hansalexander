/***
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo. 
 * Calcular el valor a cancelar por la empresa para cada empleado. 
 * Presentar un reporte como el siguiente:
Nombre 1	10	$2.5	$25
Nombre 2	11	$2	$22
Nombre 3	9	$3	$27
Nombre 4	5	$4	$20
Nombre 5	12	$2	$24
 * @author Hans
 */

import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        int cont = 1;
        double costodias, costo, numdias;
        while (cont <= 5) {
            System.out.println("Ingrese el nombre del empleado: ");
            nombre = tcl.next();
            System.out.println("Ingrese el numero de dias trabajados: ");
            numdias = tcl.nextInt();
            System.out.println("Ingrese el costo por dia trabajado: ");
            costodias = tcl.nextDouble();
            costo = numdias* costodias;
            cont++;
            System.out.println("\nReporte de Empleados:");
            System.out.printf("| %s\t | %s | %s | %s |\n", "Nombres", "Numerodias trabajados", "Cost_Dias Trabajados", "CostoT a Pagar");
            System.out.printf("| %s\t | %.2f\t | %.2f\t | %.2f\t |\n", nombre, numdias, costodias, costo);
            cont++;
            }
        }

    }
/***
 * Run
 * Ingrese el nombre del empleado: 
hans
Ingrese el numero de dias trabajados: 
22
Ingrese el costo por dia trabajado: 
5

Reporte de Empleados:
| Nombres	 | Numerodias trabajados | Cost_Dias Trabajados | CostoT a Pagar |
| hans	 | 22,00	 | 5,00	 | 110,00	 |
Ingrese el nombre del empleado: 
julio
Ingrese el numero de dias trabajados: 
32
Ingrese el costo por dia trabajado: 
3

Reporte de Empleados:
| Nombres	 | Numerodias trabajados | Cost_Dias Trabajados | CostoT a Pagar |
| julio	 | 32,00	 | 3,00	 | 96,00	 |
Ingrese el nombre del empleado: 
jorge
Ingrese el numero de dias trabajados: 
30
Ingrese el costo por dia trabajado: 
2

Reporte de Empleados:
| Nombres	 | Numerodias trabajados | Cost_Dias Trabajados | CostoT a Pagar |
| jorge	 | 30,00	 | 2,00	 | 60,00	 |
 */
   