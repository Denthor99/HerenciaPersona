package org.ieslosremedios.daw1.prog.herencia;

public class Personal extends Persona{
    private String departamento;
    private Integer salario;

    public Personal(){

    }
    public Personal(String departamento, Integer salario){
        this.departamento = departamento;
        this.salario = salario;
    }
    public void Experto(){
        if (salario>=3000){
            System.out.println("Es un experto");
        }
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
