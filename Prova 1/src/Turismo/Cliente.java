/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turismo;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private String rg;
    private Motorista motorista1;
    private Onibus onibus1;
    private Viagem v1;
    
    public Cliente(String Nome, String CPF, String RG, Motorista Motorista, Onibus Onibus, Viagem viagem1){
        this.nome = Nome;
        this.cpf = CPF;
        this.rg = RG;
        this.motorista1 = Motorista;
        this.onibus1 = Onibus;
        this.v1 = viagem1;
    }
    
    public void setViagem1(Viagem viagem1){
        this.v1 = viagem1;
    }
    
    public Viagem getViagem1(){
        return v1;
    }
    
    /**
     * @return the motorista1
     */
    public Motorista getMotorista1() {
        return motorista1;
    }

    /**
     * @param motorista1 the motorista1 to set
     */
    public void setMotorista1(Motorista motorista1) {
        this.motorista1 = motorista1;
    }

    /**
     * @return the onibus1
     */
    public Onibus getOnibus1() {
        return onibus1;
    }

    /**
     * @param onibus1 the onibus1 to set
     */
    public void setOnibus1(Onibus onibus1) {
        this.onibus1 = onibus1;
    }
    
   

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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public void visualizar() {
        System.out.println("Cliente: " + this.getNome());
        System.out.println("Motorista: " + this.motorista1.getNome());
        System.out.println("Modelo Onibus: " + this.onibus1.getModeloOnibus());
        System.out.println("Destino: " + this.getViagem1().getDestino());
        System.out.println("Valor KM: " + this.getViagem1().getValorKM() + " ");
        System.out.println("Distancia: " + this.getViagem1().getDistancia());
        System.out.println("Valor total viagem: " + this.getViagem1().getValorViagem());
    }
    
}
