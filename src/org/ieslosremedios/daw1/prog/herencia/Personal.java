package org.ieslosremedios.daw1.prog.herencia;

public class Personal extends Persona{
    private String departamento;
    private Integer salario;

    public Personal(){

    }
    public Personal(String nombre, String apellido, Integer edad, String nif, Integer nss, Domicilio domicilio, String departamento, Integer salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.nif=nif;
        this.nss=nss;
        this.departamento = departamento;
        this.salario = salario;
    }
    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
}
