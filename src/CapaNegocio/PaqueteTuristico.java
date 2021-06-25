package CapaNegocio;

import java.util.ArrayList;

public class PaqueteTuristico {

    //Constructores
    public PaqueteTuristico() {
        this.cantDias = "";
        this.precio = 0;
        this.itinerario = "";
        this.ubicacion = "";
        this.oferta = "";
        this.cantTuristas = 0;
    }
    
    //Constructor con sobrecarga de parametros
    public PaqueteTuristico(String cantDias, double precio, String itinerario, String ubicacion, String oferta, int cantTuristas) {
        this.cantDias = cantDias;
        this.precio = precio;
        this.itinerario = itinerario;
        this.ubicacion = ubicacion;
        this.oferta = oferta;
        this.cantTuristas = cantTuristas;
    }
    
    //Atributos
    private String cantDias;
    private double precio;
    private String itinerario;
    private String ubicacion;
    private String oferta;
    private int cantTuristas;
    //Implementar multiplicidad
    public CatalogoPaquetes tieneCatalogoPaquetes;
    public Reserva tieneReserva;
    public ArrayList<Trabajador> tieneTrabajadores = new ArrayList();
    
    //Propiedades
    public String getCantDias() {
        return cantDias;
    }

    public void setCantDias(String cantDias) {
        this.cantDias = cantDias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getItinerario() {
        return itinerario;
    }

    public void setItinerario(String itinerario) {
        this.itinerario = itinerario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public int getCantTuristas() {
        return cantTuristas;
    }

    public void setCantTuristas(int cantTuristas) {
        this.cantTuristas = cantTuristas;
    }
    
}
