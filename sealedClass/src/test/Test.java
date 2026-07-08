package test;

import sealed.*;
import subClases.CamionVolteo;

public class Test {
    public static void main(String[] args) {
        CamionVolteo camionVolteo = new CamionVolteo();
        camionVolteo.conducir();

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.conducir();

        Automovil automovil = new Automovil();
        automovil.conducir();

        Motocicleta motocicleta = new Motocicleta();
        motocicleta.conducir();

        Deportiva deportiva = new Deportiva();
        deportiva.conducir();

        Camion camion = new Camion();
        camion.conducir();

    }
}
