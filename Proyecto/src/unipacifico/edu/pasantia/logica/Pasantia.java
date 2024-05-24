
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
    private boolean nuevoEstado;
    

    public String getFechaFinalizaion() {
        return fechaFinalizaion;
    }

    public void setFechaFinalizaion(String fechaFinalizaion) {
        this.fechaFinalizaion = fechaFinalizaion;
    }

    public boolean isNuevoEstado() {
        return nuevoEstado;
    }

    public void setNuevoEstado(boolean nuevoEstado) {
        this.nuevoEstado = nuevoEstado;
    }

    public Pasantia(String codigoP, String nombreP, String fechainicio, String fechaFinalizaion, String descripcion, boolean activo, boolean inactivo, boolean nuevoEstado) {
        this.codigoP = codigoP;
        this.nombreP = nombreP;
        this.fechainicio = fechainicio;
        this.fechaFinalizaion = fechaFinalizaion;
        this.descripcion = descripcion;
        this.activo = activo;
        this.inactivo = inactivo;
        this.nuevoEstado = nuevoEstado;
    }
    

    public void setCodigoP(String nuevoCodigoP) {
        this.codigoP = nuevoCodigoP;
    }
    public void setNombreP (String nuevoNombreP) {
        this.nombreP = nuevoNombreP;
    }
    
   public void setFechainicio(String nuevaFechainicio) {
       this.fechainicio = nuevaFechainicio;
   }
   
   public void setFechafinalizacion (String nuevaFechafinalizacion) {
       this.fechaFinalizaion = nuevaFechafinalizacion;
   }
   public void setDescripcion (String nuevadescripcion) {
       this.descripcion = nuevadescripcion;
   }
   public void setActivo (boolean nuevoEstado) {
       this.activo = nuevoEstado;
   }
   public void setInactivo (boolean nuevoEstado ) {
       this.inactivo = nuevoEstado;
   }
   public String getNombrep () {
        return this.nombreP;
   }
   public String getCodigoP () {
       return this.codigoP;
   }
   public String getFechainicio () {
       return this.fechainicio;
   }
   public String getFechafinalizacion () {
       return this.fechaFinalizaion;
   }
   public String getDescripcion () {
       return this.descripcion;
   }
   public boolean getActivo () {
       return this.activo;
   }
   public boolean getInactivo () {
       return this.inactivo;
       
   }
    
}
