/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Paciente {
    private String nome;
    private double totalPaciente;
    private int codPaciente;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the totalPaciente
     */
    public double getTotalPaciente() {
        return totalPaciente;
    }

    /**
     * @param totalPaciente the totalPaciente to set
     */
    public void setTotalPaciente(double totalPaciente) {
        this.totalPaciente = totalPaciente;
    }
    
    public void setCodPeciente(int codPaciente){
        this.codPaciente = codPaciente;
    }
    
    public int getCodPaciente(){
        return codPaciente;
    }
}
