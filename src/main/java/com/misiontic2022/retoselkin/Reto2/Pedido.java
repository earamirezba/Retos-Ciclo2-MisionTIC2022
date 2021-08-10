package com.misiontic2022.retoselkin.Reto2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date fecha;
    private String cliente;

    private List<Vehiculo> vehiculos;

    public Pedido(Date fecha, String cliente) {
        this.fecha = fecha;
        this.cliente = cliente;

        this.vehiculos = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void adicionarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public Integer calcularCantidadVehiculos() {
        return vehiculos.size();
    }

    public Double calcularSubtotal() {
        Double subtotal = 0d;

        for (Vehiculo vehiculo : vehiculos) {
            subtotal += vehiculo.calcularPrecio();
        }

        return subtotal;
    }

    public Double calcularDescuentos() {
        Double descuentos = 0d;

        for (Vehiculo vehiculo : vehiculos) {
            descuentos += vehiculo.calcularDescuento(fecha);

        }
        return descuentos;
    }

    public Double calcularImpuestos() {
        Double impuestos = 0d;

        for (Vehiculo vehiculo : vehiculos) {
            var valorImpuesto = (vehiculo.calcularPrecio() - vehiculo.calcularDescuento(fecha));
            valorImpuesto *= vehiculo.calcularPorcentajeImpuesto() / 100;
            impuestos += valorImpuesto;
        }
        return impuestos;
    }

    public Double calcularTotal() {
        return calcularSubtotal() - calcularDescuentos() + calcularImpuestos();
    }

}
