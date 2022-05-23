package com.programacion;

/*NOTA
@Trasactional, en ejb, dotamos la capacidad de dar trasacciones y el framework implementa una  clase simislar
al ManejadorPersistenciaLogImpl añadiendo los tx.begin, tx.commit(), tx.rollback() etc, añadiendo las funciones
de transaccion sin tocar los servicios ya implementados.
 */

public interface ManejadorPersistencia {
// todos los metodo que utulice transaccion bancaria estan declarados en la interface
    CuentaBancaria buscarCuenta (String numero);
}
