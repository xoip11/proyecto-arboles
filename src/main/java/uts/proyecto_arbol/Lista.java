/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.proyecto_arbol;

/**
 *
 * @author Pc
 */
public class Lista {
    private NodoLista inicio;
    public void Add(int v) {
        NodoLista nuevo = new NodoLista(v);
        if (inicio == null) inicio = nuevo;
        else {
            NodoLista act = inicio;
            while (act.sig != null) act = act.sig;
            act.sig = nuevo;
        }
    }
    public void Print() {
        NodoLista act = inicio;
        while (act != null) {
            System.out.print(act.valor + " -> ");
            act = act.sig;
        }
        System.out.println("null");
    }
    public int Find(int pos) {
        int c = 1;
        NodoLista act = inicio;
        while (act != null) {
            if (c == pos) return act.valor;
            c++;
            act = act.sig;
        }
        return -1;
    }
    public int FindValue(int valor) {
        int pos = 1;
        NodoLista act = inicio;
        while (act != null) {
            if (act.valor == valor) return pos;
            pos++;
            act = act.sig;
        }
        return -1;
    }
    public boolean Change(int pos, int newVal) {
        int c = 1;
        NodoLista act = inicio;
        while (act != null) {
            if (c == pos) {
                act.valor = newVal;
                return true;
            }
            c++;
            act = act.sig;
        }
        return false;
    }
    public boolean Delete(int pos) {
        if (inicio == null) return false;
        if (pos == 1) {
            inicio = inicio.sig;
            return true;
        }
        NodoLista act = inicio, ant = null;
        int c = 1;
        while (act != null && c < pos) {
            ant = act;
            act = act.sig;
            c++;
        }
        if (act == null) return false;
        ant.sig = act.sig;
        return true;
    }
    public int Count() {
        int c = 0;
        NodoLista act = inicio;
        while (act != null) {
            c++;
            act = act.sig;
        }
        return c;
    }    
}
