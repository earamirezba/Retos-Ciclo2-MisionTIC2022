package com.misiontic2022.retoselkin.Reto2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private Double precioBase;
    
    public Vehiculo(String marca, String modelo, Double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public Double getPrecioBase() {
        return precioBase;
    }

    
    public abstract Double calcularPrecio(); 

    public abstract Double calcularPorcentajeImpuesto(); 
    
    public Double calcularDescuento(Date fecha) { 
        // Extrae el mes de la fecha actual. 
        // Para comparar use las constantes Calendar.JULY o Calendar.JUNE 
        var cal = GregorianCalendar.getInstance(); 
        cal.setTime(fecha); 
        var mes = cal.get(Calendar.MONTH);

        var porcentajeDescuento = 0d;

        if (mes == Calendar.JULY && marca.equals("BMW")) {
            porcentajeDescuento = 15;         
        } else if (mes == Calendar.JUNE && marca.equals("Suzuki")) {
                if (this instanceof Automovil) {
                    porcentajeDescuento = 10;
                } else if (this instanceof Motocicleta) {
                    porcentajeDescuento = 5;
                }
        }
        return calcularPrecio() * (porcentajeDescuento / 100); 
    }
}
