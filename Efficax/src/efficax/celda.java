/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efficax;

/**
 *
 * @author Moises
 */
public class celda {
    public String fila;
    public String columna;
    public double valor;
    
    public celda(String fila, String columna, double valor){
        this.fila=fila;
        this.columna=columna;
        this.valor=valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setFila(String fila){
        this.fila = fila;
    }
}
