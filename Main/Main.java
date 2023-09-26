package Main;

import Controlador.Controlador;
import Vista.ConsolaVista;

public class Main {
    public static void main(String[] args) throws Exception {
         Controlador controlador = new Controlador();
        ConsolaVista vista = new ConsolaVista(controlador);
        vista.iniciar();
    }
}