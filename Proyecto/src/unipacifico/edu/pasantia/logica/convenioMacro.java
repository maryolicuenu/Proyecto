/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unipacifico.edu.pasantia.logica;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author berca
 */
public class convenioMacro implements Serializable{ 
    
    private String numConvenio;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private String nombreEmpresa;
    private String correo;
    private String representante;
    private String archivoConvenio;       

    public convenioMacro(String numConvenio, Date fechaInicio, Date fechaFinalizacion, String nombreEmpresa, String correo, String representante, String archivoConvenio) {
        this.numConvenio = numConvenio;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.nombreEmpresa = nombreEmpresa;
        this.correo = correo;
        this.representante = representante;
        this.archivoConvenio = archivoConvenio;
    }

    public String getNumConvenio() {
        return numConvenio;
    }

    public void setNumConvenio(String numConvenio) {
        this.numConvenio = numConvenio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getArchivoConvenio() {
        return archivoConvenio;
    }

    public void setArchivoConvenio(String archivoConvenio) {
        this.archivoConvenio = archivoConvenio;
    }
   
     public void crearConvenioMacro() {
       
    }
    
    public void modificarConvenioMacro() {
        
    }
    
    public void inactivarConvenioMacro() {
        
    }
    

    
}
