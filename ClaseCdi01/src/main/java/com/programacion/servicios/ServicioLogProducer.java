package com.programacion.servicios;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;


//al ser un productor no tiene interface por q no se va a acceder por el cleinte
//va ser utilizado por el contenedor para producir las instacias del servicio log
//pero debemos hacer q servicio log lo detecte como compoenente por lo que añladimos la anotacioin
//antes de llamar al init (@PostConstructvoid init())  tiene que llamar al productor para obtener la dependecia
@ApplicationScoped
public class ServicioLogProducer {// este componente sirve como un factori para crear instancias de servicio log

    @Produces//si queremos que esto sea productor
    @ApplicationScoped
    public ServicioLog createLog(){
        System.out.println("PRODUCTOR ServicioLogProducer");
        return new ServicioLogImpl(); //retorna una instancia del componente q vamos a crear
    }
    //la ventaja del productor esque tenemos control total sobre como estamos construyendo, pero
    //desde el cliente sera irrelevante.
}
