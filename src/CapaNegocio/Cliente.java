package CapaNegocio;

public class Cliente {

    //Constructores
    public Cliente() {
        this.nombres = "";
        this.apellidos = "";
        this.edad = "";
        this.presupuesto = 0;
    }
    
    //Constructor con sobrecarga de parametros
    public Cliente(String nombres, String apellidos, String edad, double presupuesto) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.presupuesto = presupuesto;
    }
    
    //Atributos
    private String nombres;
    private String apellidos;
    private String edad;
    private double presupuesto;
    //Implementar multiplicidad
    public CatalogoPaquetes miraCatalogoPaquetes;
    
    //Propiedades
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    //Metodos
    public String ElegirPaquete()
    {
        return "No se ha implementado el Metodo Elegir Paquete";
    }
    public String Viajar()
    {
        return "No se ha implemetnado el Metodo Viajar";
    }
    public String Pagar()
    {
        return "No se ha implemetnado el Metodo Pagar";
    }
}
