/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.proyecto_arbol;

/**
 *
 * @author Pc
 */
public class Arbol {
    public NodoArbol raiz;
    private NodoArbol obs;
    public Arbol() {
        raiz = null;
        obs = null;
    }
    void insertar(int v) {
        NodoArbol nuevo, psave;
        boolean found = false;
        psave = obs;
        found = FindKey(v);
        if (found) {
            System.out.println("El nodo ya existe");
            obs = psave;
        } else {
            nuevo = new NodoArbol(v);
            if (raiz == null) {
                raiz = nuevo;
            } else {
                if (v < obs.valor)
                    obs.izq = nuevo;
                else
                    obs.der = nuevo;
            }
            obs = nuevo;
        }
    }
    public int altura() {
        return alturaRec(raiz);
    }
    private int alturaRec(NodoArbol act) {
        if (act == null) {
            return 0;
        }
        int izq = alturaRec(act.izq);
        int der = alturaRec(act.der);
        return Math.max(izq, der) + 1;
    }
    public int tamano() {
        return tamanoRec(raiz);
    }
    private int tamanoRec(NodoArbol act) {
        if (act == null) {
            return 0;
        }
        return 1 + tamanoRec(act.izq) + tamanoRec(act.der);
    }
    public void LRP() {
        if (raiz == null) {
            System.out.println("El árbol está vacío");
            return;
        }
        int suma = suma(raiz, 1);
        double lrp = (double) suma / tamano();
        System.out.println("LRP: " + lrp);
    }
    private int suma(NodoArbol act, int nivel) {
        if (act == null) return 0;
        return nivel +suma(act.izq, nivel + 1) +
                suma(act.der, nivel + 1);
    }
    public void recorrido(NodoArbol act) {
        if (act != null) {
            System.out.println(act.valor + ",");
            recorrido(act.izq);
            System.out.println(act.valor + ",");
            recorrido(act.der);
            System.out.println(act.valor + ",");
        }
    }
    private boolean FindKey(int v) {
        boolean found = false;
        NodoArbol q;
        q = raiz;
        while (!found && q != null) {
            if (v == q.valor) {
                obs = q;
                found = true;
            } else {
                if (v < q.valor) {
                    if (q.izq == null)
                        obs = q;
                    q = q.izq;
                } else {
                    if (q.der == null)
                        obs = q;
                    q = q.der;
                }
            }
        }
        return found;
    }
}