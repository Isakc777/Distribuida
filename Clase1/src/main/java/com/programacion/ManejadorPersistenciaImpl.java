package com.programacion;
 //@Stateless
public class ManejadorPersistencia {
    public CuentaBancaria buscarCuenta (String numero){
        System.out.printf("buscarCuenta(%s)\n", numero);

        return new CuentaBancaria(numero);
    }
}
