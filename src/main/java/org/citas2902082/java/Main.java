package org.citas2902082.java;

import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Usuario;
import org.citas2902082.java.entities.enums.Especialidad;
import org.citas2902082.java.entities.enums.TipoIdentificacion; 

public class Main {
    public static void main(String[] args) {
        
        Medico m = new Medico(1,
         "Nicolas",
          "Romero", 
          TipoIdentificacion.CC,
           1234567890L,
            12345466777L,
            Especialidad.ENFERMERIA);

  System.out.println(m.toString()) ;
    }
}