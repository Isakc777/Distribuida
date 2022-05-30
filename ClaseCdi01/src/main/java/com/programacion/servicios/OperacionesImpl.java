package com.programacion.servicios;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped // añadimos esto en bean.xml en vez de all iria annotated
// y con la anotacion el nombre que impleneta alc omponente ya noe s la clase q nosotros escribirmos
//ahora es un proxy class com.programacion.servicios.OperacionesImpl$Proxy$_$$_WeldClientProxy
//aqui se cumple el concepto de que es reemplkazable
//reemplaza la implementacion por una implentacion propia del contenedor

//@SessionScoped es para una aplicacion web en este caso no hay un contexto de session
//@RequestScoped es para un hambito de peticion, igual es para un hambiente web
//Nota: Los beans de sesion normalemente son selrializables, ya que se almancenan temporalmente y luego se recuperan

public class OperacionesImpl implements Operaciones {

    //DI
    @Inject private ServicioLog log; //para indicar a donde quiero que me ponga mi dependecia

    //un requerimeinto de las clases Impl es que tenga un contructor de este estilo java bean

    public OperacionesImpl(){
        System.out.println("*******OperacionesImpl contructor (entrando al constructor)");
        //es la unica forma de crear la sinstacias y luego invocamos al postcontruct para darnos la oportunidad de
        //inicializar
        // en vez de systemou colocamos log.log pero daria error por que todabia las dependecias estan sin inicializar
    }
    //Ciclo de vida
    @PostConstruct
    void init(){
       log.log("*******OperacionesImpl @PostConstruct");
    }


    @PreDestroy
    void destroy (){
        log.log("*******OperacionesImpl   @PreDestroy"); //invocamos cuando ya se acaba la app, para liberar recursos
    }


    public int sumar(int x, int y) {
        log.log("sumando los números");
        int ret = x + y;
        return ret ;
    }
}
