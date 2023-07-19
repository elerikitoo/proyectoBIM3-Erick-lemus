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
            if (op == 1) {
                guardarContacto();
            } else if (op == 2) {
                System.out.println("-----Datos de los Contactos-----");
                verTodos();
            } else if (op == 3) {
                System.out.println("-------Buscar Contacto-------");
                System.out.println("Ingrese el Numero de telefono: ");
                Scanner sd = new Scanner(System.in);
                String numero = sd.nextLine();
                System.out.println(verContacto(numero));

            } else if (op == 4) {
                System.out.println("-------Actualizar Contacto-------");
                System.out.println("Ingrese el Numero de telefono: ");
                Scanner sd = new Scanner(System.in);
                String numero = sd.nextLine();
                System.out.println(actualizarContacto(numero));
            } else if (op == 5) {
                System.out.println("Finalizado");
            } else {
                System.out.println("Incorrecto");
            }
        }
    }

    static public String actualizarContacto(String telefono) {
        Scanner sr = new Scanner(System.in);
        int posicion = -1;
        for (int i = 0; i < 15; i++) {
            if (contactos[i] != null) {
            }
            if (contactos[i].verTelefono().equals(telefono)) {

                System.out.println("Nuevo Nombre");
                String nombre = sr.nextLine();
                contactos[i].verNombre(nombre);
                System.out.println("Nuevo Domicilio");
                String domicilio = sr.nextLine();
                contactos[i].verDomicilio(domicilio);
                posicion = i;
                break;
            }
        }
        if (posicion != -1) {
            return "Nombre: " + contactos[posicion];
        } else {
            return "no Encontrado";
        }
    }

    static public String verContacto(String numero) {
        int posicion = -1;
        for (int i = 0; i < 10; i++) {
            if (contactos[i] != null) {

            }
            if (contactos[i].verTelefono().equals(numero) && contactos != null) {
                posicion = i;
                break;
            }
        }
        if (posicion != -1) {
            return "Nombre: " + contactos[posicion].verNombre() + " Domicilio: " + contactos[posicion].verDomicilio();

        } else {
            return "no Encontrado";
        }
    }

    static public void guardarContacto() {
        if (num >= 15) {
            System.out.println("--------Memoria llena--------");
        } else {
            Scanner teclado = new Scanner(System.in);
            System.out.println("---------Nuevo Contacto----------");
            System.out.println("Ingresar el numero de Telefono de la Persona");
            String telefono = teclado.nextLine();
            System.out.println("Ingrese el Nombre de la Persona");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese el Domicilio de la Persona");
            String domicilio = teclado.nextLine();
            contactos[num] = new contacto(telefono, nombre, domicilio);
            System.out.println("------------------------------");
            System.out.println("Contacto guardado");
            System.out.println("------------------------------");
            num++;
        }
    }

    static public void verTodos() {
        for (int i = 0; i < num; i++) {
            System.out.println("Telefono: " + contactos[i].verTelefono());
            System.out.println("Nombre: " + contactos[i].verNombre());
            System.out.println("Domicilio: " + contactos[i].verDomicilio());
        }
    }

}
