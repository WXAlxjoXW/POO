package Modelo;

public class Usuario {
    private int id;
    private String nombre;
    private String direccion;
    private Double telefono;
    private String correo;

    /* //*Proximo
    private Ciudad ciudad;
    private Departamento departamento;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    */
    
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getTelefono() {
        return telefono;
    }

    public void setTelefono(Double telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public Usuario(int id, String nombre, String direccion, Double telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
}