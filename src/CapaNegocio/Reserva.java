package CapaNegocio;

import java.util.Date;

public class Reserva {

    //Constructores
    public Reserva() {
        this.tipoPago = "";
        this.montoPago = 0;
        this.plazoPago = null;
    }
    
    //Constructor con sobrecarga de parametros
    public Reserva(String tipoPago, double montoPago, Date plazoPago) {
        this.tipoPago = tipoPago;
        this.montoPago = montoPago;
        this.plazoPago = plazoPago;
    }
    
    //Atributos
    private String tipoPago;
    private double montoPago;
    private Date plazoPago;
    //Implementar multiplicidad
    public PaqueteTuristico tienePaqueteTuristico;
    
    //Propiedades
    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public double getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(double montoPago) {
        this.montoPago = montoPago;
    }

    public Date getPlazoPago() {
        return plazoPago;
    }

    public void setPlazoPago(Date plazoPago) {
        this.plazoPago = plazoPago;
    }
    
}
