/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel Caproni Pegoraro
 */
public class Funcionario {
    private String nomeFuncionario;
    private String departamento;
    private double salario; 
    private String data;
    private String RG;
    private boolean ativo = true;

    /**
     * @return the nome
     */
    public String getNome() {
        return nomeFuncionario;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nomeFuncionario = nome;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void bonifica(double aumento){
        this.salario = salario + aumento;
    } 
    
    public void demite(){
        this.setAtivo(false);
    }
    
    public double getBonifica(){
        return this.getSalario() * 0.10;
    }
    
    public void mostra(){
        System.out.println("Nome: " + this.nomeFuncionario);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de Entrada: " + this.data);
        System.out.println("RG: " + this.RG);
        System.out.println("Salário: " + this.salario);
        System.out.println("Funcionario ativo? " + this.isAtivo());
    }
}
