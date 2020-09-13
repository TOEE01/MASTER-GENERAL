/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.melvin.clase02.Negocio;

import com.melvin.clase02.Dominio.DatosDePromedios;



/**
 *
 * @author recin
 */
public class LgDePromedios {
    public String Numero;

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
    public Double funcPromedios(String num1, String num2){
        Double Lab1 = Double.parseDouble(num1);
        Double Parcial = Double.parseDouble(num2);
        
        Double PromedioLab1 = Lab1 * 0.40;
        Double PromedioPar1 = Parcial * 0.60;
        
        Double Promedio = PromedioLab1 + PromedioPar1;
        Promedio /= 3;
        
        return Promedio;
    }
    public Double funcPromedios2(String num1, String num2){
        Double Lab2 = Double.parseDouble(num1);
        Double Parcial2 = Double.parseDouble(num2);
        
        Double PromedioLab2 = Lab2 * 0.40;
        Double PromedioPar2 = Parcial2 * 0.60;
        
        Double Promedio = PromedioLab2 + PromedioPar2;
        Promedio /= 3;
        
        return Promedio;
    }
    public Double funcPromedios3(String num1, String num2){
        Double Lab3 = Double.parseDouble(num1);
        Double Parcial3 = Double.parseDouble(num2);
        
        Double PromedioLab3 = Lab3 * 0.40;
        Double PromedioPar3 = Parcial3 * 0.60;
        
        Double Promedio = PromedioLab3 + PromedioPar3;
        Promedio /= 3;
        
        return Promedio;
    }  
    public Double funcProFinal(Double pro1, Double pro2, Double pro3){
        Double total = pro1 + pro2 + pro3;
        
        return total;
    }
             
}
