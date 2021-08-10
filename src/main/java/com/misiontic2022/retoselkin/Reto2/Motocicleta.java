package com.misiontic2022.retoselkin.Reto2;

public class Motocicleta extends Vehiculo{
    private Integer cilindraje;

    public Motocicleta(String marca, String modelo, Double precioBase, Integer cilindraje) {
        super(marca, modelo, precioBase);
        this.cilindraje = cilindraje;
    }

    public Integer getCilindraje() {
        return cilindraje;
    }
    
    @Override
    public Double calcularPrecio() {
        Double precio = getPrecioBase();
        if (cilindraje >= 200 && cilindraje <= 350 ){
            precio += 500_000d;
        } else if (cilindraje >= 351 && cilindraje <= 500){
            precio += 750_000d;
        } else if (cilindraje > 500){
            precio += 1_000_000d;
        }
        return precio;
    }

    @Override
    public Double calcularPorcentajeImpuesto() {
        return calcularPrecio() > 7_500_000d ? 10d : 0d;
    }

    
    
}
