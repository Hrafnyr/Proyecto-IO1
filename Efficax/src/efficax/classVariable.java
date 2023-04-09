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
public class classVariable {
    public String id;
    public String name;
    public int cantMin;
    public int horas;
    public double valor=0;
    public String exceso;
    public String artificial;
    
    public classVariable(String id, String name, double valor, int cant,
                            int h, String ex, String ar){
        this.id=id;
        this.name=name;
        this.valor=valor;
        this.cantMin=cant;
        this.horas=h;
        this.exceso=ex;
        this.artificial=ar;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
}


