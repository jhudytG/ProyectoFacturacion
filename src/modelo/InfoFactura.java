/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jhudy
 */
public class InfoFactura {
    
    private int id_infofactura;
    private int id_factura;
    private String detalle;
    private int cantidad;
    private double precio;
    private boolean iva;

    public InfoFactura() {
    }

    public InfoFactura(int id_infofactura, int id_factura, String detalle, int cantidad, double precio, boolean iva) {
        this.id_infofactura = id_infofactura;
        this.id_factura = id_factura;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precio = precio;
        this.iva = iva;
    }

    public int getId_infofactura() {
        return id_infofactura;
    }

    public void setId_infofactura(int id_infofactura) {
        this.id_infofactura = id_infofactura;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }
    
    
    
}
