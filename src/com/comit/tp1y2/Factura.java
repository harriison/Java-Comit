package com.comit.tp1y2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private Date fecha;
    private Persona persona;
    private ArrayList<Producto> productos;

    public Factura(Persona persona, ArrayList<Producto> productos) {
        this.fecha = new Date();
        this.persona = persona;
        this.productos = productos;
    }

    public void imprimirFactura() {
        double totalProducto;
        double totalFacturar = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaComoCadena = sdf.format(fecha);

        System.out.println("Fecha: " + fechaComoCadena);
        System.out.println("-------------------");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Domicilio: " + persona.getDomicilio());
        System.out.println("-------------------------");
        for (Producto producto : productos) {
            totalProducto = producto.getPrecio() * producto.getCantidad();
            System.out.println(producto.getCantidad() + " u. D: " + producto.getDescripcion() + " C/U $"
                    + producto.getPrecio() + " T: $" + totalProducto);
            System.out.println("______________________________________");
            totalFacturar += totalProducto;
        }
        double iva = totalFacturar * 0.21;
        System.out.println("IVA: " + iva);
        System.out.println("Subtotal (sin IVA): " + totalFacturar);
        System.out.println("Total: " + totalFacturar + iva);

    }
}
