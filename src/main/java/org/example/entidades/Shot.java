package org.example.entidades;

public class Shot extends Bebida {

    private String marcaAlcohol;
    private String tipoAlcohol;

    public Shot() {
    }

    public Shot(Integer id, String nombre, String descripcion, Double costoFabricacion, Double costoVenta, String marcaAlcohol, String tipoAlcohol) {
        super(id, nombre, descripcion, costoFabricacion, costoVenta);
        this.marcaAlcohol = marcaAlcohol;
        this.tipoAlcohol = tipoAlcohol;
    }

    public String getMarcaAlcohol() {
        return marcaAlcohol;
    }

    public void setMarcaAlcohol(String marcaAlcohol) {
        this.marcaAlcohol = marcaAlcohol;
    }

    public String getTipoAlcohol() {
        return tipoAlcohol;
    }

    public void setTipoAlcohol(String tipoAlcohol) {
        this.tipoAlcohol = tipoAlcohol;
    }

    @Override
    public String toString() {
        return "Shot{" +
                "marcaAlcohol='" + marcaAlcohol + '\'' +
                ", tipoAlcohol='" + tipoAlcohol + '\'' +
                '}';
    }
}
