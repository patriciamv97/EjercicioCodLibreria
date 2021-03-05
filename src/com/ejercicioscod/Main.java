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

        miSalida = FactoriaDeSalidas.getProductoTipoSalida(FactoriaDeSalidas.CONSOLA, "Visualización por consola completa");
        miSalida.comunicar();

        salidaVentana = FactoriaDeSalidas.getProductoTipoSalida(FactoriaDeSalidas.VENTANA, "Visualización por ventana completa");
        salidaVentana.comunicar();

        salidaImpresora=FactoriaDeSalidas.getProductoTipoSalida(FactoriaDeSalidas.IMPRESORA,"Impresión completa.");
        salidaImpresora.comunicar();

        InterfaceMetodosComunes miEntrada;
        InterfaceMetodosComunes entradaConsola;
        InterfaceMetodosComunes entradaVentana;

        entradaConsola=FactoriaDeSalidas.getProductoTipoEntrada(FactoriaDeSalidas.CONSOLA,"Entrada por consola : ");
        entradaConsola.comunicar();

        entradaVentana=FactoriaDeSalidas.getProductoTipoEntrada(FactoriaDeSalidas.VENTANA,"Entrada  por ventana :");
        entradaVentana.comunicar();
		/*
		Consola consola = new Consola("Hola");
        consola.visualizar();
        Ventana ventana = new Ventana("Adios");
        ventana.visualizar();
        */
    }
}
