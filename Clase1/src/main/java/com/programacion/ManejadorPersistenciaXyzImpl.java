package com.programacion;

public class ManejadorPersistenciaXyzImpl implements ManejadorPersistencia {
    public CuentaBancaria buscarCuenta (String numero){
        System.out.println("******buscando Cuenta Xyz: " + numero);

        return new CuentaBancaria(numero);


    }
}
