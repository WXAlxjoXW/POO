package Modelo;

public class Ciudad {
    private int id;
    private String nombre;
    private Departamento departamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
     public Ciudad() {
    }

    public Ciudad(int id, String nombre, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }
}