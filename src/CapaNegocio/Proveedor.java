package CapaNegocio;

import java.util.ArrayList;

public class Proveedor {

    //Constructores
    public Proveedor() {
        this.tipo = "";
        this.cantArticulos = 0;
        this.montoPago = 0;
        this.encargado = "";
    }
    
    //Constructor con sobrecarga de parametros
    public Proveedor(String tipo, int cantArticulos, double montoPago, String encargado) {
        this.tipo = tipo;
        this.cantArticulos = cantArticulos;
        this.montoPago = montoPago;
        this.encargado = encargado;
    }
    
    //Atributos
    private String tipo;
    private int cantArticulos;
    private double montoPago;
    private String encargado;
    //Implementar multiplicidad    
    public ArrayList<Trabajador> necesitaTrabajadores = new ArrayList();
    
    //Propiedades
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantArticulos() {
        return cantArticulos;
    }

    public void setCantArticulos(int cantArticulos) {
        this.cantArticulos = cantArticulos;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    
    //Metodos
    public String Proveer()
    {
        return "No se ha implemetnado el Metodo Proveer";
    }
}
