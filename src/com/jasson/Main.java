package com.jasson;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ListaSimple i = new ListaSimple();
        int opcion =0;
        int dato;
        Scanner escribir = new Scanner(System.in);
        Scanner tama = new Scanner(System.in);
        do{
            System.out.println("LISTAS SIMPLEMENTE LIGADAS");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Buscar en la lista");
            System.out.println("3. Modificar dato en la lista");
            System.out.println("4. Eliminar dato en la lista");
            System.out.println("5. Enlistar datos");
            System.out.println("Escoja alguna opción");
            opcion = escribir.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("INGRESAR DATOS A LA LISTA");
                    System.out.println("Ingrese el tamaño de la lista: ");
                    int tamaño = tama.nextInt();
                    for (int k= 0; k <tamaño; k++){
                        System.out.println("Ingrese dato a la lista: ");
                        dato = escribir.nextInt();
                        i.ingresarNodo(dato);
                    }
                    break;

                case 2:
                    System.out.println("BUSCAR NODO");
                    System.out.println("Ingrese el dato a buscar");
                    dato = escribir.nextInt();
                    i.buscarnodo(dato);
                    break;
                case 3:
                    System.out.println("MODIFICAR NODO");
                    System.out.println("Ingrese el dato a modificar");
                    dato = escribir.nextInt();
                    i.modificar(dato);

                    break;
                case 4:
                    System.out.println("ELIMINAR NODO");
                    System.out.println("Ingrese el dato a eliminar");
                    dato = escribir.nextInt();
                    i.eliminar(dato);
                    break;
                case 5:
                    System.out.println("Tus datos enlistados");
                    i.verlista();
                    break;
                default:
            }
        }while(opcion < 6);






    }
}


