package org.citas2902082.java.entities;
import org.citas2902082.java.entities.enums.TipoIdentificacion;
import org.citas2902082.java.entities.enums.Especialidad;

public class Medico extends Usuario {

    private Long registroMedico;
    private Especialidad especialidad;


    public Medico(Integer id, 
                String nombres, 
                String apellidos, 
                TipoIdentificacion tipoIdentificacion,
                 Long numerIdentificacion, 
                Long registroMedico, 
                 Especialidad especialidad) {
                 
    //constructor der la clase padre
    //es un constructor de la clase hija 
    //es lo primero que debe aparecer  
                
        super(id, nombres, apellidos, tipoIdentificacion, numerIdentificacion);

        //iniciar los atributos propios de la clase padre 
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }


    public Long getRegistroMedico() {
        return registroMedico;
    }


    public void setRegistroMedico(Long registroMedico) {
        this.registroMedico = registroMedico;
    }


    public Especialidad getEspecialidad() {
        return especialidad;
    }


    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    @Override
    public String toString() {
        return
      super.toString() + "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]";

        
    }
    

}






