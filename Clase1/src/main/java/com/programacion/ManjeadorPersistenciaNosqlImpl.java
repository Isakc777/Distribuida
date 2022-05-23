package com.programacion;

public class ManjeadorPersistenciaNosql implements ManejadorPersistencia {

    public CuentaBancaria buscarCuenta (String numero){
        System.out.printf("buscarCuenta NOSQL(%s)\n", numero);

        return new CuentaBancaria(numero);
    }


}
