
package unipacifico.edu.pasantia.logica;

import java.io.Serializable;


public class Pasantia implements Serializable{
    
    private String codigo;
    private String nombreEmpresa;
    private String fechainicio;
    private String fechafinalizaion;
    private String descripcion;
    private String numeroPasantes;
    private String numeroConvenioMacro;
    private boolean estado;

   

    public Pasantia(String codigo, String nombreEmpresa, String fechainicio, String fechafinalizaion, String descripcion, String numeroPasantes, String numeroConvenioMacro, String numeroConvenioMacro1) {
        this.codigo = codigo;
        this.nombreEmpresa = nombreEmpresa;
        this.fechainicio = fechainicio;
        this.fechafinalizaion = fechafinalizaion;
        this.descripcion = descripcion;
        this.numeroPasantes = numeroPasantes;
        this.numeroConvenioMacro = numeroConvenioMacro;
    }

    

    public Pasantia(String codigo, String nombreEmpresa, String descripcion, String fechaInicio, String fechaFinalizacion, String numeroPasantes, String numeroConvenioMacro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pasantia(String string, String camila_Andrade, String camilagmailcom, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    public String getCodigoP() {
        return codigo;
    }

    public void setCodigoP(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreP() {
        return nombreEmpresa;
    }

    public void setNombreP(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafinalizaion() {
        return fechafinalizaion;
    }

    public void setFechafinalizaion(String fechafinalizaion) {
        this.fechafinalizaion = fechafinalizaion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNumeroPasantes() {
        return numeroPasantes;
    }

    public void setNumeroPasantes(String numeroPasantes) {
        this.numeroPasantes = numeroPasantes;
    }

    public String getNumeroConvenioMacro() {
        return numeroConvenioMacro;
    }

    public void setNumeroConvenioMacro(String numeroConvenioMacro) {
        this.numeroConvenioMacro = numeroConvenioMacro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

   
}