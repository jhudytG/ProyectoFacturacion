/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jhudy
 */
public class Factura {
    
    private int id_factura;
    private int id_cliente;
    private String ruc;
    private Date fecha;
    private ArrayList<InfoFactura> listaInfoFactura;

    public Factura() {
    }

    public Factura(int id_factura, int id_cliente, String ruc, Date fecha, ArrayList<InfoFactura> listaInfoFactura) {
        this.id_factura = id_factura;
        this.id_cliente = id_cliente;
        this.ruc = ruc;
        this.fecha = fecha;
        this.listaInfoFactura = listaInfoFactura;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<InfoFactura> getListaInfoFactura() {
        return listaInfoFactura;
    }

    public void setListaInfoFactura(ArrayList<InfoFactura> listaInfoFactura) {
        this.listaInfoFactura = listaInfoFactura;
    }
    
    // MÉTODOS
    
    public double subtotal(){ 
        
        return 0;
    }
    
    public double iva(){
        
        return 0;
    }
    
    public double total(){
        
        return 0;
    }
    
    
}
