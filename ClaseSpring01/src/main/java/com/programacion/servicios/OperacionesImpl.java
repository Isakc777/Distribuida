package com.programacion.servicios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //esto es equivalente al @ApplicationScope
//en EJB es vez de @Component es Stailess
public class OperacionesImpl implements Operaciones {


    //DI
    // @Autowired es el equivalente al @Inject
    @Autowired private ServicioLog log; //para indicar a donde quiero que me ponga mi dependecia
    //un requerimeinto de las clases Impl es que tenga un contructor de este estilo java bean
    //en vez de @Autowired iria @EJB

    public OperacionesImpl(){
        System.out.println("*******OperacionesImpl contructor (entrando al constructor)");
        //es la unica forma de crear la sinstacias y luego invocamos al postcontruct para darnos la oportunidad de
        //inicializar
        // en vez de systemou colocamos log.log pero daria error por que todabia las dependecias estan sin inicializar
    }

    public int sumar(int x, int y) {
        log.log("sumando los números");
        int ret = x + y;
        return ret ;
    }
}
