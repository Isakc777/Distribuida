package com.programacion;
//con  Ejbs seria un @Entity
public class CuentaBancaria {

    private String cuenta;
    //contructor recibe el nombre de la cuenta
    public CuentaBancaria(String n) {
        this.cuenta = cuenta;
    }

   public void deposito(float monto){
       System.out.printf("deposito(%.2f)\n", monto);

   }
    public void retiro(float monto){
        System.out.printf("retiro(%.2f)\n", monto);
    }

}
