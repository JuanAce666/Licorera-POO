package org.example.entidades;

public abstract class Coctel extends Bebida {

    private String presentacion;

    public Coctel() {
    }

    public Coctel(Integer id, String nombre, String descripcion, Double costoFabricacion, Double costoVenta, String presentacion) {
        super(id, nombre, descripcion, costoFabricacion, costoVenta);
        this.presentacion = presentacion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    @Override
    public String toString() {
        return "Coctel{" +
                "presentacion='" + presentacion + '\'' +
                '}';
    }

    public abstract void calcularCaducidad();
}


//fechas (la 1 actual, la 2 la pone el usuario)
//la diferencia en horas de esas 2 fechas
//condicion pregunto si la diferencia es mayor a 4 horas vencido si no habilido la venta