package com.programacion;

//AOP, poder introducir funcionalidad adicional sin topar los servicios originales
public class ManejadorPersistenciaLogImpl implements ManejadorPersistencia {

    private ManejadorPersistenciaImpl impl = new ManejadorPersistenciaImpl();

    //delegar la busqueda
    public CuentaBancaria buscarCuenta (String numero){
        System.out.println("***********buscando Cuenta:" + numero);

        return impl.buscarCuenta(numero);


    }
}
