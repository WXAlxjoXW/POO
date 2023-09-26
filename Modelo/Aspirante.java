package Modelo;

public class Aspirante {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String nivelEscolaridad;
    private Institucion institucion;
    private Cargo cargoAspirado;

    public Aspirante(int id, String nombre, String direccion, String telefono, String nivelEscolaridad, Institucion institucion, Cargo cargoAspirado) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nivelEscolaridad = nivelEscolaridad;
        this.institucion = institucion;
        this.cargoAspirado = cargoAspirado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNivelEscolaridad() {
        return nivelEscolaridad;
    }

    public void setNivelEscolaridad(String nivelEscolaridad) {
        this.nivelEscolaridad = nivelEscolaridad;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public Cargo getCargoAspirado() {
        return cargoAspirado;
    }

    public void setCargoAspirado(Cargo cargoAspirado) {
        this.cargoAspirado = cargoAspirado;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Cargo Aspirado: " + cargoAspirado.getNombre();
    }
}