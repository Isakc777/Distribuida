package com.programacion;

import com.programacion.servicios.Operaciones;
import com.programacion.servicios.ServicioLog;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

public class Principal {
    public static void main(String[] args) {


        //crear la instacnia del contenedor
        SeContainer container = SeContainerInitializer
                .newInstance()
                .initialize();

        //buscar el componente  //ejemplo de un lookup
        Instance<Operaciones> obj = container.select(Operaciones.class);
        //recuperar el componeente
        Operaciones servicio = obj.get();
        System.out.println(servicio.getClass());//para saber cual es la clase concreta que implementa
                                                //siendo class com.programacion.servicios.OperacionesImpl,
                                                // la implementacion que nosotros escirbimos

        //Invocar el metodo

        int ret = servicio.sumar(5, 9);

        System.out.printf("El resultado es : %d\n", ret);

        //solicitemos el componente del log
        ServicioLog log = container.select(ServicioLog.class).get();
        log.log("FIN");



    }
}
