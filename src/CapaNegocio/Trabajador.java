package CapaNegocio;

import java.util.ArrayList;

public class Trabajador {

    //Constructores
    public Trabajador() {
        this.nombres = "";
        this.apellidos = "";
        this.edad = "";
        this.tipo = "";
        this.telefono = "";
        this.dni = "";
    }
    
    //Constructor con sobrecarga de parametros
    public Trabajador(String nombres, String apellidos, String edad, String tipo, String telefono, String dni) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.tipo = tipo;
        this.telefono = telefono;
        this.dni = dni;
    }
    
    //Atributos
    private String nombres;
    private String apellidos;
    private String edad;
    private String tipo;
    private String telefono;
    private String dni;
    //Implementar multiplicidad   
    public PaqueteTuristico trabajaEnPaqueteTuristico;
    public ArrayList<Proveedor> necesitaProveedores = new ArrayList();
    
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //Metodos
    public String Trabajar()
    {
        return "No se ha implemetnado el Metodo Trabajar";
    }
    public String RecibirSueldo()
    {
        return "No se ha implemetnado el Metodo Recibir Sueldo";
    }
}
