/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import unipacifico.edu.pasantia.logica.Pasantia;
import java.io.IOException;
import java.util.ArrayList;
import unipacifico.edu.pasantia.persistencia.PasantiaDAO;
/**
 *
 * @author Usuario
 */
public class pasantiaGestion {
    


    
    public static void main(String[] args) {
        
         Pasantia Estudiante1= new Pasantia ("45455", "Monica Diaz","juan@gmail.com"
                , "45454545");
        Pasantia Estudiante2= new Pasantia("11111","Pedro Castro","pedro@gmail.com",
                "8888888");
        
         Pasantia Estudiante3 = new Pasantia("222222", "Daniela Ortega","daniela@gmail.com"
                , "312454545");
        Pasantia Estudiante4= new Pasantia("333333","Camila Andrade","camila@gmail.com",
                "31688888");
        
        ArrayList<Pasantia> listaPasantia = new ArrayList<>();
        listaPasantia.add(Estudiante1);
        listaPasantia.add(Estudiante2);
        listaPasantia.add(Estudiante3);
        listaPasantia.add(Estudiante4);
        
        try{
            PasantiaDAO dao = new PasantiaDAO();
            dao.guardar(listaPasantia);
             
              ArrayList <Pasantia> listado= dao.leer();
              for (Pasantia pasante: listado){
                  System.out.println(pasante.getCodigoP());
              }
        }
        catch(IOException error){ error.printStackTrace();}
        catch(ClassNotFoundException errorTipo){errorTipo.printStackTrace();}
    }
    }
    



