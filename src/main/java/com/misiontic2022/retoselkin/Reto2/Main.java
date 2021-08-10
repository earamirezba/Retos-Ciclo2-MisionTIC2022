package com.misiontic2022.retoselkin.Reto2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 * TEST Reto2 Ciclo2 MisionTic2022
 *
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        var fecha = new SimpleDateFormat("dd/MM/yyyy").parse("10/06/2021");
        var pedido = new Pedido(fecha, "Cesar Díaz");
        pedido.adicionarVehiculo(new Automovil("BMW", "i8", 300_000_000d, TipoTransmision.MANUAL, true, true));
        pedido.adicionarVehiculo(new Motocicleta("Suzuki", "VStrong", 30_000_000d, 600));
        System.out.printf("Cliente: %s %n", pedido.getCliente());
        System.out.printf("Numero vehiculos: %d %n", pedido.calcularCantidadVehiculos());
        System.out.printf("Subtotal: %,.2f %n", pedido.calcularSubtotal());
        System.out.printf("Descuento: %,.2f %n", pedido.calcularDescuentos());
        System.out.printf("Impuestos: %,.2f %n", pedido.calcularImpuestos());
        System.out.printf("Total: %,.2f %n", pedido.calcularTotal());

        fecha = new SimpleDateFormat("dd/MM/yyyy").parse("17/03/2021");
        pedido = new Pedido(fecha, "Carlos Perez");
        pedido.adicionarVehiculo(new Automovil("Kia", "Rio Sedan", 60_000_000d, TipoTransmision.MANUAL, false, false));
        pedido.adicionarVehiculo(
                new Automovil("Kia", "Rio Hatchback", 64_000_000d, TipoTransmision.AUTOMATICA, true, true));
        pedido.adicionarVehiculo(new Motocicleta("Suzuki", "VStrong", 30_000_000d, 600));
        pedido.adicionarVehiculo(new Motocicleta("Auteco", "VICTORY BOLD", 5_999_000d, 125));
        System.out.printf("Cliente: %s %n", pedido.getCliente());
        System.out.printf("Numero vehiculos: %d %n", pedido.calcularCantidadVehiculos());
        System.out.printf("Subtotal: %,.2f %n", pedido.calcularSubtotal());
        System.out.printf("Descuento: %,.2f %n", pedido.calcularDescuentos());
        System.out.printf("Impuestos: %,.2f %n", pedido.calcularImpuestos());
        System.out.printf("Total: %,.2f %n", pedido.calcularTotal());
    }

}
