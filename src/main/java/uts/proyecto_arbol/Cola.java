/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.proyecto_arbol;

/**
 *
 * @author Pc
 */
public class Cola {
    private NodoCola inicio;
 private NodoCola fin;
 private int tam;
 private int max;
 public Cola(int max) {
 this.max = max;
 tam = 0;
 inicio = fin = null;   
}
 public void insert(int v) {
 if (tam == max) return;
 NodoCola nuevo = new NodoCola(v);
 if (inicio == null) inicio = fin = nuevo;
 else {
 fin.sig = nuevo;
 fin = nuevo;
 }
 tam++;
 }
 public int extract() {
 if (inicio == null) return -1;
 int v = inicio.valor;
 inicio = inicio.sig;
 tam--;
 return v;
 }
 public void imprimir() {
 NodoCola act = inicio;
 while (act != null) {
 System.out.println(act.valor);
 act = act.sig;
 }
 }
 public int tamcola() {
 return tam;
 }
}
