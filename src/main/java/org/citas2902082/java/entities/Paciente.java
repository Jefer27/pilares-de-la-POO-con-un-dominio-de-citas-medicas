package org.citas2902082.java.entities;

import java.time.LocalDate;
import org.citas2902082.java.entities.enums.TipoSangre;
import java.time.LocalDateTime;


public class Paciente {

    public Integer id;
    public String nombres;
    public String apellidos;
    public String tipoIdentificacion;
    public Integer numeroIdentificacion;
    public String email;
    public Integer celular;
    public LocalDateTime fechadenacimiento;
    public Double altura;
    public double peso;
    public TipoSangre tipoSangre;
    public char factorRH;

    
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
