
package unipacifico.edu.pasantia.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import unipacifico.edu.pasantia.logica.Pasantia;





/**
 *
 * @author General
 */
public class PasantiaDAO {
    
    public void guardar(ArrayList<Pasantia>listaPasantia)throws IOException{
        File archivo = new File("pasantia.pas") ;
        FileOutputStream fos = new FileOutputStream(archivo);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(listaPasantia);
        oos.close();
        fos.close();
        
    }
    
    public ArrayList<Pasantia> leer()throws IOException, ClassNotFoundException{
     ArrayList<Pasantia> lista = new ArrayList<Pasantia>();
     File archivo = new File("pasantia.pas") ;
     FileInputStream fis = new FileInputStream(archivo);
     ObjectInputStream ois= new ObjectInputStream(fis);
     lista = (ArrayList<Pasantia>)ois.readObject();
     
     return lista;   
    }
    
}

    

