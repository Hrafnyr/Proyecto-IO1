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
public class cell {
    public String fila;
    public String columna;
    public double valor;
    public boolean tachado=false;
    
    public cell(String fila, String columna, double valor,boolean t){
        this.fila=fila;
        this.columna=columna;
        this.valor=valor;
        this.tachado=t;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setTachado(boolean t){
        this.tachado = t;
    }
}
