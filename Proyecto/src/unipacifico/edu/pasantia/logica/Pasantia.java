
package unipacifico.edu.pasantia.logica;

import java.io.Serializable;


public class Pasantia implements Serializable{
    
    private String codigoP;
    private String nombreP;
    private String fechainicio;
    private String fechaFinalizaion;
    private String descripcion;
    private boolean activo;
    private boolean inactivo;
    private boolean estado;

    public Pasantia(String codigoP, String nombreP, String fechainicio, String fechaFinalizaion, String descripcion, boolean activo, boolean inactivo, boolean estado) {
        this.codigoP = codigoP;
        this.nombreP = nombreP;
        this.fechainicio = fechainicio;
        this.fechaFinalizaion = fechaFinalizaion;
        this.descripcion = descripcion;
        this.activo = activo;
        this.inactivo = inactivo;
        this.estado = estado;
    }

    public String getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(String codigoP) {
        this.codigoP = codigoP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechaFinalizaion() {
        return fechaFinalizaion;
    }

    public void setFechaFinalizaion(String fechaFinalizaion) {
        this.fechaFinalizaion = fechaFinalizaion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getInactivo() {
        return inactivo;
    }

    public void setInactivo(boolean inactivo) {
        this.inactivo = inactivo;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    }
