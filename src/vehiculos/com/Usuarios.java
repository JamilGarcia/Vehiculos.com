package vehiculos.com;

import java.util.ArrayList;
import java.util.Date;

public class Usuarios {
    
    private String nombre;
    private String nickname;
    private String contra;
    private String pais;
    private Date fecha;
    private String correo;
    private boolean Vdirecto;
    private boolean Vsubasta;
    private boolean rentadora;
    private boolean carwash;
    private ArrayList <Vehiculo> vh = new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String nombre, String nickname, String contra, String pais, Date fecha, String correo, boolean Vdirecto, boolean Vsubasta, boolean rentadora, boolean carwash) {
        this.nombre = nombre;
        this.nickname = nickname;
        this.contra = contra;
        this.pais = pais;
        this.fecha = fecha;
        this.correo = correo;
        this.Vdirecto = Vdirecto;
        this.Vsubasta = Vsubasta;
        this.rentadora = rentadora;
        this.carwash = carwash;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isVdirecto() {
        return Vdirecto;
    }

    public void setVdirecto(boolean Vdirecto) {
        this.Vdirecto = Vdirecto;
    }

    public boolean isVsubasta() {
        return Vsubasta;
    }

    public void setVsubasta(boolean Vsubasta) {
        this.Vsubasta = Vsubasta;
    }

    public boolean isRentadora() {
        return rentadora;
    }

    public void setRentadora(boolean rentadora) {
        this.rentadora = rentadora;
    }

    public boolean isCarwash() {
        return carwash;
    }

    public void setCarwash(boolean carwash) {
        this.carwash = carwash;
    }
    
    public ArrayList<Vehiculo> getVh() {
        return vh;
    }

    public void setVh(ArrayList<Vehiculo> vh) {
        this.vh = vh;
    }
    

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + '}';
    }

    
    
    
    
}
