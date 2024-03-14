package org.citas2902082.java.entities;

import java.time.LocalDate;
import org.citas2902082.java.entities.enums.TipoSangre;
import java.time.LocalDateTime;


public class Paciente {

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


    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }


    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }


    public void setNumeroIdentificacion(Integer numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Integer getCelular() {
        return celular;
    }


    public void setCelular(Integer celular) {
        this.celular = celular;
    }


    public LocalDateTime getFechadenacimiento() {
        return fechadenacimiento;
    }


    public void setFechadenacimiento(LocalDateTime fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }


    public Double getAltura() {
        return altura;
    }


    public void setAltura(Double altura) {
        this.altura = altura;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    public TipoSangre getTipoSangre() {
        return tipoSangre;
    }


    public void setTipoSangre(TipoSangre tipoSangre) {
        this.tipoSangre = tipoSangre;
    }


    public char getFactorRH() {
        return factorRH;
    }


    public void setFactorRH(char factorRH) {
        this.factorRH = factorRH;
    }


    private Integer id;
    private String nombres;
    private String apellidos;
    private String tipoIdentificacion;
    private Integer numeroIdentificacion;
    private String email;
    private Integer celular;
    private LocalDateTime fechadenacimiento;
    private Double altura;
    private double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    
    public Paciente(String nombres, String apellidos, String tipoIdentificacion, Integer numeroIdentificacion,
            String email, Integer celular, LocalDateTime fechadenacimiento, Double altura, double peso,
            TipoSangre tipoSangre, char factorRH) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.email = email;
        this.celular = celular;
        this.fechadenacimiento = fechadenacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }


    










}
