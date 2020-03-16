package vehiculos.com;

import java.io.Serializable;

public class Vehiculo implements Serializable{
    
    private String marca; 
    private String modelo; 
    private int año; 
    private String cilindraje; 
    private String tipo; 
    private String transmision; 
    private int precio; 
    
    private static final long SerialVersionUID = 02261L;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int año, String cilindraje, String tipo, String transmision, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.cilindraje = cilindraje;
        this.tipo = tipo;
        this.transmision = transmision;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + año;
    }

   
    
    
}
