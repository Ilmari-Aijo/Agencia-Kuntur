package CapaNegocio;

import java.util.ArrayList;

public class CatalogoPaquetes {

    //Constructores
    public CatalogoPaquetes() {
        this.cantPaquetes = 0;
        this.clasificacionZonas = "";
        this.clasificacionPrecio = "";
        this.clasificaionDias = "";
    }
    
    //Constructor con sobrecarga de parametros
    public CatalogoPaquetes(int cantPaquetes, String clasificacionZonas, String clasificacionPrecio, String clasificaionDias) {
        this.cantPaquetes = cantPaquetes;
        this.clasificacionZonas = clasificacionZonas;
        this.clasificacionPrecio = clasificacionPrecio;
        this.clasificaionDias = clasificaionDias;
    }
    
    //Atributos
    private int cantPaquetes;
    private String clasificacionZonas;
    private String clasificacionPrecio;
    private String clasificaionDias;
    //Implementar multiplicidad
    public ArrayList<PaqueteTuristico> tienePaqueteTuristico = new ArrayList();
    public Cliente observadoPorCliente;
    
    //Propiedades

    public int getCantPaquetes() {
        return cantPaquetes;
    }

    public void setCantPaquetes(int cantPaquetes) {
        this.cantPaquetes = cantPaquetes;
    }

    public String getClasificacionZonas() {
        return clasificacionZonas;
    }

    public void setClasificacionZonas(String clasificacionZonas) {
        this.clasificacionZonas = clasificacionZonas;
    }

    public String getClasificacionPrecio() {
        return clasificacionPrecio;
    }

    public void setClasificacionPrecio(String clasificacionPrecio) {
        this.clasificacionPrecio = clasificacionPrecio;
    }

    public String getClasificaionDias() {
        return clasificaionDias;
    }

    public void setClasificaionDias(String clasificaionDias) {
        this.clasificaionDias = clasificaionDias;
    }
    
    //Metodos
    public String OfrecerPaquetes()
    {
        return "No se ha implemetnado el Metodo Ofrecer Paquetes";
    }
}
