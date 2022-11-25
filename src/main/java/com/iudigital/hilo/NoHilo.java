package com.iudigital.hilo;

import java.security.SecureRandom;

public class NoHilo {

    private static final int TAMN = 1000000;
//    int productosA[] = new int[TAMN];
//    int pedidosB[] = new int[TAMN];
    int stockC[] = new int[TAMN];
    int mayor = 0;
    long time = System.currentTimeMillis();
    SecureRandom srm = new SecureRandom();

//    public void llenarA() {
//        for (int i = 0; i < TAMN; i++) {
//            productosA[i] = srm.nextInt(100);
//            System.out.println("Llenando  sin hilo A " + productosA[i] + " Time " + (System.currentTimeMillis() - time) / 1000 + " seg");
//        }
//    }
//
//    public void llenarB() {
//
//        for (int i = 0; i < TAMN; i++) {
//            pedidosB[i] = srm.nextInt(100);
//            System.out.println("Llenando B " + pedidosB[i] + " Time:  " + (System.currentTimeMillis() - time) / 1000 + " seg");
//        }
//    }
    public void resultado() {
        int result = 0;
        for (int i = 0; i < TAMN; i++) {

            if (VectorA.vectorA[i] == VectorB.vectorB[i]) {
                result = VectorA.vectorA[i];
//                System.out.println("Procesando Stock " + stockC[i] + " " + (System.currentTimeMillis() - time) / 1000 + " seg");
            } else if (VectorB.vectorB[i] > VectorA.vectorA[i]) {
                result = 2 * (VectorB.vectorB[i] - VectorB.vectorB[i]);
//                System.out.println("Procesando Stock " + stockC[i] + " " + (System.currentTimeMillis() - time) / 1000 + " seg");
            } else if (VectorA.vectorA[i] > VectorB.vectorB[i]) {
                result = VectorB.vectorB[i];
//                System.out.println("procesando Stock " + stockC[i] + " " + (System.currentTimeMillis() - time) / 1000 + " seg");
            } else {
                System.out.println("No hay compras");
            }
            stockC[i] = result;
        }
//        System.out.println("Tiempo final : " + (System.currentTimeMillis() - time) / 1000 + " segundos ");
    }

    public void pedidoMayor() {
        for (int i = 0; i < TAMN; i++) {
            if (stockC[i] > mayor) {
                mayor = stockC[i];
            }
        }
        System.out.println("El pedido mayor es = " + mayor);
    }
}
