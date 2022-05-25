package com.programacion;

public class Principal {
    public static void main(String[] args) {

        TransaccionBancaria tb = new TransaccionBancaria();

        //delegamos la creacion de la dependencia
        ManejadorPersistencia mp= new ManejadorPersistenciaXyzImpl();
        tb.setManejadorPersistencia(mp);
        //prueba1

        tb.realizarTransferencia("001", "002", 10.0f);

        /*-- Nota: podemos reutilizar el ManejadorPersistencia en todas partes
             TransaccionBancaria tb2 = new TransaccionBancaria();
             tb2.setManejadorPersistencia(mp);

             TransaccionBancaria tb3 = new TransaccionBancaria();
             tb3.setManejadorPersistencia(mp);
         */

        /* El hecho de que la clase de transaccion bancaria, no cree el manejador de persisitencia
         con un new, sino que espera que alguien le pase esa dependencia, eso es lo que se
         denomina inversion de control IoC, se invierte el control, yo no creo las dependecias, sino alguien
         me pasa las dependecias, en terminos generales se le llama inyeccion de dependecias,
         -una de las formas  de IoC es la inyeccion de dependecias

         */

    }
}
