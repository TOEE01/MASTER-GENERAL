/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClsOperacionesMat;

/**
 *
 * @author recin
 */
public class ClsOperacionesMat {
    private double Dato1, Dato2, r;

    public double getDato1() {
        return Dato1;
    }

    public void setDato1(double Dato1) {
        this.Dato1 = Dato1;
    }

    public double getDato2() {
        return Dato2;
    }

    public void setDato2(double Dato2) {
        this.Dato2 = Dato2;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double Suma (){
        Double Dato1 = this.Dato1;
        Double Dato2 = this.Dato2;
        
        return Dato1 + Dato2;
    }
     public double Resta (){
        Double Dato1 = this.Dato1;
        Double Dato2 = this.Dato2;
        
        return Dato1 - Dato2;
     }
      public double Division (){
        Double Dato1 = this.Dato1;
        Double Dato2 = this.Dato2;
        
        return Dato1 / Dato2;
     }
      public double Multiplicacion (){
        Double Dato1 = this.Dato1;
        Double Dato2 = this.Dato2;
        
        return Dato1 * Dato2;
     }
      
}
