package vehiculos.com;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdminVehiculo {
    
    private ArrayList <Vehiculo> vehi = new ArrayList(); 
    private File archivo = null; 
    
    public AdminVehiculo (String path) {
        archivo = new File(path);
    }

    public ArrayList<Vehiculo> getVehi() {
        return vehi;
    }

    public void setVehi(ArrayList<Vehiculo> vehi) {
        this.vehi = vehi;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setVehiculo(Vehiculo v){
        vehi.add(v);
    }
    
    public void cargarArchivo() {
        try {            
            vehi = new ArrayList();
            Vehiculo temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Vehiculo) objeto.readObject()) != null) {
                        vehi.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Vehiculo t : vehi) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
}
