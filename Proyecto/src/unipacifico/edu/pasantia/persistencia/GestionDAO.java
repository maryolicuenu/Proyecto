/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author Usuario
 */
public class GestionDAO {
    
 
    
    public void guardar(ArrayList<Pasantia>listaGestion)throws IOException{
        File archivo = new File("convenio.con") ;
        FileOutputStream fos = new FileOutputStream(archivo);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(listaGestion);
        oos.close();
        fos.close();
        
    }
    
    public ArrayList<Pasantia> leer()throws IOException, ClassNotFoundException{
     ArrayList<Pasantia> lista = new ArrayList<Pasantia>();
     File archivo = new File("turista.tur") ;
     FileInputStream fis = new FileInputStream(archivo);
     ObjectInputStream ois= new ObjectInputStream(fis);
     lista = (ArrayList<Pasantia>)ois.readObject();
     
     return lista;   
    }
    
}


