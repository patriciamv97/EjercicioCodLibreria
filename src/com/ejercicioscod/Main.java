package com.ejercicioscod;

//import libreria.Consola;
import libreria.FactoriaDeSalidas;
import libreria.InterfaceMetodosComunes;
//import libreria.Ventana;

public class Main {

    public static void main(String[] args) {

        InterfaceMetodosComunes miSalida;
        InterfaceMetodosComunes salidaVentana;
        InterfaceMetodosComunes salidaImpresora;

        miSalida = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.CONSOLA, "Visualización por consola completa");
        miSalida.visualizar();

        salidaVentana = FactoriaDeSalidas.getProducto(FactoriaDeSalidas.VENTANA, "Visualización por ventana completa");
        salidaVentana.visualizar();

        salidaImpresora=FactoriaDeSalidas.getProducto(FactoriaDeSalidas.IMPRESORA,"Impresión completa.");
        salidaImpresora.visualizar();
		/*
		Consola consola = new Consola("Hola");
        consola.visualizar();
        Ventana ventana = new Ventana("Adios");
        ventana.visualizar();
        */
    }
}
