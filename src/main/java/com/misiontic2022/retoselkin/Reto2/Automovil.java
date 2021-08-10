package com.misiontic2022.retoselkin.Reto2;

public class Automovil extends Vehiculo {

    private TipoTransmision transmision;
    private Boolean vidriosElectricos;
    private Boolean aireAcondicionado;

    public Automovil(String marca, String modelo, Double precioBase, TipoTransmision transmision,
            Boolean vidriosElectricos, Boolean aireAcondicionado) {
        super(marca, modelo, precioBase);
        this.transmision = transmision;
        this.vidriosElectricos = vidriosElectricos;
        this.aireAcondicionado = aireAcondicionado;
    }

    public TipoTransmision getTransmision() {
        return transmision;
    }

    public Boolean getVidriosElectricos() {
        return vidriosElectricos;
    }

    public Boolean getAireAcondicionado() {
        return aireAcondicionado;
    }

    @Override
    public Double calcularPrecio() {
        Double precio = getPrecioBase();
        if (transmision == TipoTransmision.AUTOMATICA){
            precio *= (100 + 5.0) / 100;
        }

        if (vidriosElectricos){
            precio += 400000d;
        }

        if (aireAcondicionado){
            precio += 3000000d;
        }
        return precio;
    }

    @Override
    public Double calcularPorcentajeImpuesto() {

        return calcularPrecio() > 60_000_000d ? 10d : 0d;
    }

}
