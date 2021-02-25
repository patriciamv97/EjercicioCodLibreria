package com.ejercicioscod;
import libreria.*;
public class Main {

    public static void main(String[] args) {
	Consola consola =new Consola("Hola");
	consola.visualizar();
	Ventana ventana = new Ventana("Adios");
	ventana.visualizar();
    }
}
