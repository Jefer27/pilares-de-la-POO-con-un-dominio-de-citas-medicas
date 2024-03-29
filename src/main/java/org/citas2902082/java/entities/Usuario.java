package org.citas2902082.java.entities;

import org.citas2902082.java.entities.enums.TipoIdentificacion;

public abstract class Usuario {

    protected Integer id;
    protected String nombres;
    protected String apellidos;
    protected TipoIdentificacion tipoIdentificacion;
    protected Long numerIdentificacion;

    public Usuario(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numerIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numerIdentificacion = numerIdentificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Long getNumerIdentificacion() {
        return numerIdentificacion;
    }

    public void setNumerIdentificacion(Long numerIdentificacion) {
        this.numerIdentificacion = numerIdentificacion;
    }

  //definir el metodo tostring
    @Override
    public String toString() {
        return "Usuario [nombres=" + nombres + ", apellidos=" + apellidos + "]";
    }

  
    
    

}
