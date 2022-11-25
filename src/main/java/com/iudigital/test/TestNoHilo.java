package com.iudigital.test;

import com.iudigital.hilo.NoHilo;
import com.iudigital.hilo.VectorA;
import com.iudigital.hilo.VectorB;

public class TestNoHilo {

    public static void main(String[] args) {
        
        long time = System.currentTimeMillis();
        VectorA vectorA = new VectorA();
        VectorB vectorB = new VectorB();
        NoHilo noHilo = new NoHilo();
        
        
        vectorA.llenarA();
        vectorB.llenarB();
        noHilo.resultado();
        noHilo.pedidoMayor();
//        long end = System.currentTimeMillis();
        System.out.println("Tiempo final : " + (System.currentTimeMillis() - time) / 1000 + " segundos ");

    }
}
