package Controlador;

import java.util.ArrayList;
import java.util.List;
import Modelo.Aspirante;
import Modelo.Cargo;
import Modelo.Institucion;

public class Controlador {

    private List<Aspirante> aspirantes;
    private List<Cargo> cargos;
    private List<Institucion> instituciones;

    public Controlador() {
        aspirantes = new ArrayList<>();
        cargos = new ArrayList<>();
        instituciones = new ArrayList<>();
    }

    public void crearAspirante(Aspirante aspirante) {
        aspirantes.add(aspirante);
    }

    public void eliminarAspirante(int id) {
        Aspirante aspirante = buscarAspirante(id);
        if (aspirante != null) {
            aspirantes.remove(aspirante);
        }
    }

    public Aspirante buscarAspirante(int id) {
        for (Aspirante aspirante : aspirantes) {
            if (aspirante.getId() == id) {
                return aspirante;
            }
        }
        return null;
    }

    public void crearCargo(Cargo cargo) {
        cargos.add(cargo);
    }

    public void eliminarCargo(int id) {
        Cargo cargo = buscarCargo(id);
        if (cargo != null) {
            cargos.remove(cargo);
        }
    }

    public Cargo buscarCargo(int id) {
        for (Cargo cargo : cargos) {
            if (cargo.getId() == id) {
                return cargo;
            }
        }
        return null;
    }

    public void crearInstitucion(Institucion institucion) {
        instituciones.add(institucion);
    }
    public void eliminarInstitucion(int id) {
        Institucion institucion = buscarInstitucion(id);
        if (institucion != null) {
            instituciones.remove(institucion);
        }
    }
    public Institucion buscarInstitucion(int id) {
        for (Institucion institucion : instituciones) {
            if (institucion.getId() == id) {
                return institucion;
            }
        }
        return null;
    }
    public List<Aspirante> getAspirantes() {
        return aspirantes;
    }
    public List<Cargo> getCargos() {
        return cargos;
    }
    public List<Institucion> getInstituciones() {
        return instituciones;
    }
}