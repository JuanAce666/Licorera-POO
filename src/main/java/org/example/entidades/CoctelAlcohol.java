package org.example.entidades;

public class CoctelAlcohol extends Coctel {

    private String alcoholUtilizado;

    public CoctelAlcohol() {
    }

    public CoctelAlcohol(Integer id, String nombre, String descripcion, Double costoFabricacion, Double costoVenta, String presentacion, String alcoholUtilizado) {
        super(id, nombre, descripcion, costoFabricacion, costoVenta, presentacion);
        this.alcoholUtilizado = alcoholUtilizado;
    }

    public String getAlcoholUtilizado() {
        return alcoholUtilizado;
    }

    public void setAlcoholUtilizado(String alcoholUtilizado) {
        this.alcoholUtilizado = alcoholUtilizado;
    }

    @Override
    public String toString() {
        return "CoctelAlcohol{" +
                "alcoholUtilizado='" + alcoholUtilizado + '\'' +
                '}';
    }

    @Override
    public void calcularCaducidad() {

    }
}
