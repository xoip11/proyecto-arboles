/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.proyecto_arbol;

/**
 *
 * @author Pc
 */
public class Pila {
    private NodoPila tope;
 private int tam;
 private int max;
 public Pila(int max) {
 this.max = max;
 tam = 0;
 tope = null;
 }
    public void push(int v) {
 if (tam == max) return;
 NodoPila nuevo = new NodoPila(v);
 nuevo.sig = tope;
 tope = nuevo;
 tam++;
 }
 public int pop() {
 if (tope == null) return -1;
 int val = tope.valor;
 tope = tope.sig;
 tam--;
 return val;
 }
 public boolean Empty() {
 return tam == 0;
 }
 public boolean Full() {
 return tam == max;
 }
 public int size() {
 return tam;
 }
 public void imprimirPila() {
 NodoPila act = tope;
 while (act != null) {
 System.out.println(act.valor);
 act = act.sig;
 }
 }
}
