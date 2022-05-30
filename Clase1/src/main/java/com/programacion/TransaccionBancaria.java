package com.programacion;

//si esto fuese un EJB esto seria un @Stateless
public class TransaccionBancaria {
    //nuestra transaccion va tener un atributo del tipo manejador persistencia
    //este como es una dependecia seria @EJB

    //instancia de la interfaz
    private ManejadorPersistencia manejadorPersistencia;



    //creamos una isntancia del manejador persisitencia, las variables de intancia se
    //inicializan en el constructor


    //public TransaccionBancaria(){
        //implementacion inicial
        //manejadorPersistencia = new ManejadorPersistenciaImpl(); // eso no es DI ni lookup por que esta creando la dependecia directa

        //mediante el uso de interfaz podemos hacer distintas implementaciones
        //manejadorPersistencia = new ManjeadorPersistenciaNosqlImpl();

        //otra implementacion
       // manejadorPersistencia = new ManejadorPersistenciaLogImpl();

    //}

    //en lugar de crear la instancia, podemos delegar a que alguien le pase la instancia q se necesita para trabajar
    public void setManejadorPersistencia(ManejadorPersistencia manejadorPersistencia){

        this.manejadorPersistencia = manejadorPersistencia;

    }
    //método realizar tranferencia
    public void realizarTransferencia(String cuenta1, String cuenta2, float monto){

        System.out.printf("realizarTransferencia(%s,%s,%.2f)\n", cuenta1, cuenta2, monto);

       CuentaBancaria objCuenta1 = manejadorPersistencia.buscarCuenta(cuenta1);
       CuentaBancaria objCuenta2 = manejadorPersistencia.buscarCuenta(cuenta2);

       objCuenta1.deposito(monto);
       objCuenta2.retiro(monto);


    }



}
