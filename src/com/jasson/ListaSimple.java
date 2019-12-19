package com.jasson;
import java.util.Scanner;

public class ListaSimple {
    Nodo primero ; // primero de la lista
    Nodo ultimo; // ultimo de la lista
    Scanner tecla = new Scanner(System.in);
    public ListaSimple() {
        primero = null;
        ultimo = null;
    }

    public void ingresarNodo(int dato){
        Nodo nuevo = new Nodo();
        nuevo.dato=dato;
        if(primero == null){
            primero = nuevo; // si el nuevo nodo que ingreso es el primero y unico
            primero.siguiente = null; // apunta a null
            ultimo = primero; // y como es el primero y no hay otros, por ende sera el ultimo tambien
        }else { // si ya hay mas nodos
            ultimo.siguiente=nuevo; //el ultimo nodo ingresado apunte al nuevo nodo
            nuevo.siguiente = null; // indicando que este sera el ultimo
            ultimo = nuevo; // indica que sera el ultimo
        }
    }
    public void buscarnodo(int dato){
        Nodo actual = new Nodo();
        actual = primero;
        while (actual != null){
            if(actual.dato == dato){
                System.out.println("Felicidades...el dato existe");
                actual = actual.siguiente;
            }else{
                System.out.println("ummmmm...el dato no existe");
            }
            actual = actual.siguiente;
        }
    }

    public void modificar(int dato){
        Nodo actual = new Nodo();
        actual = primero;
        while(actual!=null){
            if(actual.dato == dato){
                System.out.println("Ingrese el nuevo dato: ");
                actual.dato = tecla.nextInt();

            }
            actual = actual.siguiente;
        }
    }
    public void eliminar(int dato){
        Nodo actual = new Nodo(); // este nos sirve para recorrer la lista
        Nodo anterior = new Nodo(); // guarda el antrior al nodo actual
        actual = primero;
        anterior = null;
        while(actual != null){
            if(actual.dato == dato){
                if(actual == primero){ //si el nodo que se va a elimnar es el primero, apuntamos al siguiente que esta despues del primero y lo hacemos primero
                    primero = primero.siguiente;
                }else{
                    anterior.siguiente = actual.siguiente;
                }
            }
            anterior = actual;
            actual = actual.siguiente;
        }
    }
    public void verlista(){
        Nodo actual = new Nodo(); //nodo auxiliar que nos ayuda a recorrer la lista
        actual = primero;
        while(actual != null){
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }


}
