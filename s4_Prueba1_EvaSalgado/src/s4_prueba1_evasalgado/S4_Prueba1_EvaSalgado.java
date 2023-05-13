/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s4_prueba1_evasalgado;

import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class S4_Prueba1_EvaSalgado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int resp = 1;
        int opcion = 0;
        int cont = 0;
        do {
            System.out.println("Bienvenido a mi primera prueba practica!");
            System.out.println("Aqui esta su menu: ");
            System.out.println("1. 1. Repetir mi nombre");
            System.out.println("2. SubMenu de mensajes.");
            System.out.println("3. Salir");
            System.out.println("por favor, elija una opcion");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: repetir mi nombre ");

                    System.out.println("Ingrese cantidad de veces que se repetira el texto: ");
                    int veces = leer.nextInt();

                    String name = "Eva Salgado";
                    for (int i = 0; i < veces; i++) {
                        System.out.println("Hola mi nombre es " + name + " y miren mi prueba!");
                    }
                    System.out.println("Desea regresar al menú principal?[1/0]: ");
                    resp = leer.nextInt();
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Has elegido: Submenu de mensajes");

                    int opsub = 0; //opcion de submenu
                    int contsub = 0;//contador de submenu

                    String bienvenida = "";
                    while (opsub != 3) {
                        System.out.println("Elija su opcion: ");
                        System.out.println("1. Bienvenida");
                        System.out.println("2. Despedida");
                        System.out.println("3. Salir del submenu");
                        opsub = leer.nextInt();

                        switch (opsub) {
                            case 1:
                                System.out.println(bienvenida);//bienvenida vieja
                                System.out.println("Bienvenida: ");//Ingrese un mensaje de bienvenida
                                bienvenida = leer.nextLine();
                                bienvenida = leer.nextLine();
                                
                                System.out.println(bienvenida);
                                System.out.println("");

                                break;
                            case 2: 
                                System.out.println("Hasta luego, gracias por usar mi programa"); 
                                System.out.println("");
                                break; 
                            case 3: 
                                System.out.println("cantidad de veces repetidas en el submenu: "+contsub);
                                opsub = 3; 
                                System.out.println("");
                                break; 
                            default :
                                System.out.println("Opcion no valida");
                        }
                        contsub++;
                    } 
                    break; 
                case 3: 
                    System.out.println("Adios, esta fue mi prueba");
                    System.out.println("Cantidad de veces repetidas en el programa: "+cont);
                    break; 
                default: 
                    System.out.println("Opcion no valida");
                    resp = 1;
                    System.out.println("");
                    
            }
            cont++;
        } while (resp != 0 && opcion != 3);

    }

}
