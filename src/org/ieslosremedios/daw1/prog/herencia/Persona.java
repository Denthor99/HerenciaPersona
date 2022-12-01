package org.ieslosremedios.daw1.prog.herencia;

public class Persona {
    protected String nombre="Roberto";
    protected String apellido;
    protected Integer edad;
    protected String nif;
    protected Integer nss;
    protected Domicilio domicilio;

    public Persona(){

    }

    public Persona(String nombre, String apellido, Integer edad, String nif, Integer nss){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.nif=nif;
        this.nss=nss;
    }
    public void saludar(){
        System.out.println("Hola me llamo "+nombre+", tengo "+edad);
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public Integer getEdad(){
        return edad;
    }
    public void setEdad(Integer edad){
        this.edad=edad;
    }
    public String getNif(){
        return nif;
    }
    public void setNif(String nif){
        this.nif=nif;
    }
    public Integer getNss(){
        return nss;
    }
    public void setNss(Integer nss){
        this.nss=nss;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}