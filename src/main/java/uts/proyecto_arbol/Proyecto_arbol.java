/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uts.proyecto_arbol;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Proyecto_arbol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();
        Pila pila = new Pila(10);
        Cola cola = new Cola(10);
        Arbol arbol = new Arbol();
        int opcion;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. LISTAS");
            System.out.println("2. PILAS");
            System.out.println("3. COLAS");
            System.out.println("4. ARBOLES");
            System.out.println("5. SALIR");
            System.out.print("Seleccionar opcion => ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> menuListas(sc, lista);
                case 2 -> menuPilas(sc, pila);
                case 3 -> menuColas(sc, cola);
                case 4 -> menuArboles(sc, arbol);
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida");
            }
        } while (opcion != 5);
    }
    static void menuListas(Scanner sc, Lista lista) {
        int op;
        do {
            System.out.println("\n--- MENU LISTA ---");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Encontrar por posicion");
            System.out.println("3. Cambiar nodo");
            System.out.println("4. Buscar valor");
            System.out.println("5. Eliminar nodo");
            System.out.println("6. Contar elementos");
            System.out.println("7. Imprimir lista");
            System.out.println("8. Regresar");
            System.out.print("Seleccionar opcion => ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Ingrese valor: ");
                    lista.Add(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Posicion: ");
                    System.out.println("Valor: " + lista.Find(sc.nextInt()));
                }
                case 3 -> {
                    System.out.print("Posicion: ");
                    int p = sc.nextInt();
                    System.out.print("Nuevo valor: ");
                    System.out.println(lista.Change(p, sc.nextInt())
                            ? "Modificado"
                            : "No se pudo modificar");
                }
                case 4 -> {
                    System.out.print("Valor: ");
                    System.out.println("Posicion: " + lista.FindValue(sc.nextInt()));
                }
                case 5 -> {
                    System.out.print("Posicion: ");
                    System.out.println(lista.Delete(sc.nextInt())
                            ? "Nodo eliminado"
                            : "No se pudo eliminar");
                }
                case 6 -> System.out.println("Cantidad: " + lista.Count());
                case 7 -> lista.Print();
                case 8 -> System.out.println("Regresando...");
            }
        } while (op != 8);
    }
    static void menuPilas(Scanner sc, Pila pila) {
        int op;
        do {
            System.out.println("\n--- MENU PILAS ---");
            System.out.println("1. Tamano actual");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Imprimir pila");
            System.out.println("5. Regresar");
            System.out.print("Seleccionar opcion => ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> System.out.println("Tamano: " + pila.size());
                case 2 -> {
                    System.out.print("Valor: ");
                    pila.push(sc.nextInt());
                }
                case 3 -> System.out.println("Extraido: " + pila.pop());
                case 4 -> pila.imprimirPila();
                case 5 -> System.out.println("Regresando...");
            }
        } while (op != 5);
    }
    static void menuColas(Scanner sc, Cola cola) {
        int op;
        do {
            System.out.println("\n--- MENU COLAS ---");
            System.out.println("1. Tamano actual");
            System.out.println("2. Insert");
            System.out.println("3. Extract");
            System.out.println("4. Imprimir cola");
            System.out.println("5. Regresar");
            System.out.print("Seleccionar opcion => ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> System.out.println("Tamano: " + cola.tamcola());
                case 2 -> {
                    System.out.print("Valor: ");
                    cola.insert(sc.nextInt());
                }
                case 3 -> System.out.println("Extraido: " + cola.extract());
                case 4 -> cola.imprimir();
                case 5 -> System.out.println("Regresando...");
            }
        }
        while (op != 5);
    }
    static void menuArboles(Scanner sc, Arbol arbol) {
        int op;
        do {
            System.out.println("\n--- MENU ARBOLES ---");
            System.out.println("1. Insertar nodo");
            System.out.println("2. Imprimir tamano");
            System.out.println("3. Imprimir altura");
            System.out.println("4. Imprimir LRP");
            System.out.println("5. Imprimir recorrido");
            System.out.println("6. Regresar");
            System.out.print("Seleccionar opcion => ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Valor: ");
                    arbol.insertar(sc.nextInt());
                }
                case 2 -> System.out.println("Tamano: " + arbol.tamano());
                case 3 -> System.out.println("Altura: " + arbol.altura());
                case 4 -> arbol.LRP();
                case 5 -> arbol.recorrido(arbol.raiz);
                case 6 -> System.out.println("Regresando...");
            }
        } while (op != 6);
    }
}