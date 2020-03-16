package vehiculos.com;

import java.io.File;

public class Empresas {
    
    private String nombre;
    private String mision;
    private String vision; 
    private String objetivos;
    private File imagen;
    private Ubicacion ubicacion;
    private int telefono;
    private String correo;
    private String direccion; 

    public Empresas() {
    }

    public Empresas(String nombre, String mision, String vision, String objetivos, File imagen, Ubicacion ubicacion, int telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.mision = mision;
        this.vision = vision;
        this.objetivos = objetivos;
        this.imagen = imagen;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public File getImagen() {
        return imagen;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empresas{" + "nombre=" + nombre + '}';
    }
    
    
}
