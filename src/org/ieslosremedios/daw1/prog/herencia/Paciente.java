package org.ieslosremedios.daw1.prog.herencia;

public class Paciente extends Persona{
    private String Cita;
    private String medicoAsignado;

    public Paciente(){

    }

    public Paciente(String Cita, String medicoAsignado){
        this.Cita=Cita;
        this.medicoAsignado=medicoAsignado;
    }
    public String getCita(){
        return Cita;
    }
    public void setCita(String cita){
        this.Cita=Cita;
    }

    public String getMedicoAsignado(){
        return medicoAsignado;
    }
    public void setMedicoAsignado(String medicoAsignado){
        this.medicoAsignado=medicoAsignado;
    }
}
