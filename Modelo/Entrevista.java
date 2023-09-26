package Modelo;

public class Entrevista {
    
    private Aspirante aspirante;
    private Cargo cargoAspirado;
    private String proceso;
    public Aspirante getAspirante() {
        return aspirante;
    }
    public void setAspirante(Aspirante aspirante) {
        this.aspirante = aspirante;
    }
    public Cargo getCargoAspirado() {
        return cargoAspirado;
    }
    public void setCargoAspirado(Cargo cargoAspirado) {
        this.cargoAspirado = cargoAspirado;
    }
    public String getProceso() {
        return proceso;
    }
    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
}