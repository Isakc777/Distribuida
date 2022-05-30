package com.programacion;

import com.programacion.config.Config;
import com.programacion.servicios.Operaciones;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {
    public static void main(String[] args) {

        //CREAR EL CONTENEDOR
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //este es el similar al SeContainer
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        //hacemos un lookup por q estamos fuera del contenedor
        //BUSCAR UN COMPONENTE
        // en vez del select aqui es getBean
        Operaciones servicio = context.getBean( Operaciones.class);
        System.out.println(servicio.getClass());// nos retorna la clase que hicimos, no hace proxys

        //INVOCAR AL SERVICIO
        int ret = servicio.sumar(5, 9);
        System.out.printf("la suma es: %d\n", ret);
    }
}
