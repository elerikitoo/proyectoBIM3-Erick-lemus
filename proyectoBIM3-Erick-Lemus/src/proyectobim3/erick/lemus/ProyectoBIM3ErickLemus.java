
package proyectobim3.erick.lemus;

import java.util.Scanner;


public class ProyectoBIM3ErickLemus {
 static contacto contactos[] = new contacto[15];
    static int num = 0;
    
    public static void main(String[] args) {
      

    

        int op = 0;
        Scanner teclado = new Scanner(System.in);

        while (op != 5) {
            System.out.println("--------------------");
            System.out.println("       MENU      ");
            System.out.println("1. Guardar Contacto");
            System.out.println("2. Ver Todos los Contactos");
            System.out.println("3. Buscar un Contacto");
            System.out.println("4. Actualizar Contacto");
            System.out.println("5. Salir");
            System.out.println("--------------------");
            System.out.println("Ingrese el Numero de Opcion");
            op = teclado.nextInt();
        }
    }
}