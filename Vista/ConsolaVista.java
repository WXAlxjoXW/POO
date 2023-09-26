package Vista;

import java.util.List;
import java.util.Scanner;
import Controlador.Controlador;
import Modelo.Aspirante;
import Modelo.Cargo;
import Modelo.Institucion;

public class ConsolaVista {
    private Controlador controlador;
    private Scanner scanner;

    public ConsolaVista(Controlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion;
        do {
            System.out.println("1) Crear Aspirante");
            System.out.println("2) Eliminar Aspirante");
            System.out.println("3) Crear Cargo");
            System.out.println("4) Eliminar Cargo");
            System.out.println("5) Crear Institucion");
            System.out.println("6) Eliminar Institucion");
            System.out.println("7) Mostrar Aspirantes");
            System.out.println("8) Mostrar Cargos");
            System.out.println("9) Mostrar Instituciones");
            System.out.println("10) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearAspirante();
                    break;
                case 2:
                    eliminarAspirante();
                    break;
                case 3:
                    crearCargo();
                    break;
                case 4:
                    eliminarCargo();
                    break;
                case 5:
                    crearInstitucion();
                    break;
                case 6:
                    eliminarInstitucion();
                    break;
                case 7:
                    mostrarAspirantes();
                    break;
                case 8:
                    mostrarCargos();
                    break;
                case 9:
                    mostrarInstituciones();
                    break;
                case 10:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("!Opción no válida¡");
                    System.out.println("!Intente de nuevo¡");
            }
        } while (opcion != 10);
    }

    private void crearAspirante() {
        System.out.print("Ingrese ID del aspirante --> ");
        int id = scanner.nextInt();
        System.out.print("Ingrese nombre del aspirante --> ");
        String nombre = scanner.next();
        System.out.print("Ingrese dirección del aspirante --> ");
        String direccion = scanner.next();
        System.out.print("Ingrese teléfono del aspirante --> ");
        String telefono = scanner.next();
        System.out.print("Ingrese nivel de escolaridad del aspirante --> ");
        String nivelEscolaridad = scanner.next();
        System.out.print("Ingrese ID de la institución del aspirante --> ");
        int idInstitucion = scanner.nextInt();
        Institucion institucion = controlador.buscarInstitucion(idInstitucion);
        if (institucion == null) {
            System.out.println("!La institución no existe¡");
            return;
        }
        System.out.print("Ingrese ID del cargo aspirado --> ");
        int idCargo = scanner.nextInt();
        Cargo cargo = controlador.buscarCargo(idCargo);
        if (cargo == null) {
            System.out.println("!El cargo no existe¡");
            return;
        }

        Aspirante aspirante = new Aspirante(id, nombre, direccion, telefono, nivelEscolaridad, institucion, cargo);
        controlador.crearAspirante(aspirante);
        System.out.println("Aspirante creado con éxito.");
    }

    private void eliminarAspirante() {
        System.out.print("Ingrese ID del aspirante a eliminar --> ");
        int id = scanner.nextInt();
        controlador.eliminarAspirante(id);
        System.out.println("Aspirante eliminado con éxito.");
    }

    private void crearCargo() {
        System.out.print("Ingrese ID del cargo --> ");
        int id = scanner.nextInt();
        System.out.print("Ingrese nombre del cargo --> ");
        String nombre = scanner.next();
        Cargo cargo = new Cargo(id, nombre);
        controlador.crearCargo(cargo);
        System.out.println("Cargo creado con éxito.");
    }

    private void eliminarCargo() {
        System.out.print("Ingrese ID del cargo a eliminar --> ");
        int id = scanner.nextInt();
        controlador.eliminarCargo(id);
        System.out.println("Cargo eliminado con éxito.");
    }

    private void crearInstitucion() {
        System.out.print("Ingrese ID de la institución --> ");
        int id = scanner.nextInt();
        System.out.print("Ingrese nombre de la institución --> ");
        String nombre = scanner.next();
        Institucion institucion = new Institucion(id, nombre);
        controlador.crearInstitucion(institucion);
        System.out.println("Institución creada con éxito.");
    }

    private void eliminarInstitucion() {
        System.out.print("Ingrese ID de la institución a eliminar --> ");
        int id = scanner.nextInt();
        controlador.eliminarInstitucion(id);
        System.out.println("Institución eliminada con éxito.");
    }

    private void mostrarAspirantes() {
        System.out.println("Lista de Aspirantes:");
        List<Aspirante> aspirantes = controlador.getAspirantes();
        for (Aspirante aspirante : aspirantes) {
            System.out.println(aspirante);
        }
    }

    private void mostrarCargos() {
        System.out.println("Lista de Cargos: ");
        List<Cargo> cargos = controlador.getCargos();
        for (Cargo cargo : cargos) {
            System.out.println("ID: " + cargo.getId() + ", Nombre: " + cargo.getNombre());
        }
    }

    private void mostrarInstituciones() {
        System.out.println("Lista de Instituciones: ");
        List<Institucion> instituciones = controlador.getInstituciones();
        for (Institucion institucion : instituciones) {
            System.out.println("ID: " + institucion.getId() + ", Nombre: " + institucion.getNombre());
        }
    }
}