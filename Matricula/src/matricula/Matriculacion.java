/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;

/**
 *
 * @author Wendy Soto
 */
public class Matriculacion {
    
    String cajamateria;
    String cajaestudiante;

    public Matriculacion(String cajamateria, String cajaestudiante) {
        this.cajamateria = cajamateria;
        this.cajaestudiante = cajaestudiante;
    }

    public String getCajamateria() {
        return cajamateria;
    }

    public void setCajamateria(String cajamateria) {
        this.cajamateria = cajamateria;
    }

    public String getCajaestudiante() {
        return cajaestudiante;
    }

    public void setCajaestudiante(String cajaestudiante) {
        this.cajaestudiante = cajaestudiante;
    }

   
    
}
