package org.example.entidades;

public class CoctelSinAlcohol extends Coctel {

    private String saborSoda;

    public CoctelSinAlcohol() {
    }

    public CoctelSinAlcohol(Integer id, String nombre, String descripcion, Double costoFabricacion, Double costoVenta, String presentacion, String saborSoda) {
        super(id, nombre, descripcion, costoFabricacion, costoVenta, presentacion);
        this.saborSoda = saborSoda;
    }


    public String getSaborSoda() {
        return saborSoda;
    }

    public void setSaborSoda(String saborSoda) {
        this.saborSoda = saborSoda;
    }

    @Override
    public String toString() {
        return "CoctelSinAlcohol{" +
                "saborSoda='" + saborSoda + '\'' +
                '}';
    }

    @Override
    public void calcularCaducidad() {
        
    }
}
