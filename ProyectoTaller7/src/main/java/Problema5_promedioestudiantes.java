/***
 *Problema 5
 *Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos 
 *ingresar el nombre del estudiante, el promedio de ciclo. Presentar el siguiente reporte
 *Estudiante1	 10	Aprobado
 *Estudiante2	 6.9	Reprobado
 *Estudiante3	 7	Aprobado
 *Estudiante4	 5	Reprobado
 *Atención; con base al valor del promedio, usted debe asignar en cada 
 *registro el tipo Aprobado o Reprobado.
 * @author Hans
 */

import java.util.Scanner;

public class Problema5_promedioestudiantes {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int cont = 1;
        while (cont <= 4){
            System.out.print("DAME EL NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL ESTUDIANTE" + cont + ": ");
            nombre = tcl.next(); 
        promedio = tcl.nextDouble();
        if (promedio < 7)
            estado = "Reprobado";
        else
            estado = "Aprobado";
        System.out.printf("| %s\t | %s | %s\t|\n","NOMBRE","PROMEDIO","ESTADO");
        System.out.printf("| %s\t | %.2f\t  | %s\t|\n",nombre, promedio, estado);
        cont++;
        }
    }
    
}
/***
 * Run
 DAME EL NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL ESTUDIANTE1: hans
9
| NOMBRE	 | PROMEDIO | ESTADO	|
| hans	 | 9,00	  | Aprobado	|
DAME EL NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL ESTUDIANTE2: jorge
10
| NOMBRE	 | PROMEDIO | ESTADO	|
| jorge	 | 10,00	  | Aprobado	|
DAME EL NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL ESTUDIANTE3: luis
6
| NOMBRE	 | PROMEDIO | ESTADO	|
| luis	 | 6,00	  | Reprobado	|
DAME EL NOMBRE DEL ESTUDIANTE Y PROMEDIO DEL ESTUDIANTE4: javier
8
| NOMBRE	 | PROMEDIO | ESTADO	|
| javier	 | 8,00	  | Aprobado	|
 */