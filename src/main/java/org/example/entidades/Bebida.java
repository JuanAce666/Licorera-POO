package org.example.entidades;

public class Bebida {

    private  Integer id;
    private String nombre;
    private String descripcion;
    private Double costoFabricacion;
    private Double costoVenta;

    public Bebida() {

    }

    public Bebida(Integer id, String nombre, String descripcion, Double costoFabricacion, Double costoVenta) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costoFabricacion = costoFabricacion;
        this.costoVenta = costoVenta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(Double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public Double getCostoVenta() {
        return costoVenta;
    }

    public void setCostoVenta(Double costoVenta) {
        this.costoVenta = costoVenta;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", costoFabricacion=" + costoFabricacion +
                ", costoVenta=" + costoVenta +
                '}';
    }
}
