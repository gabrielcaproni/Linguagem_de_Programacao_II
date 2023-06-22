/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielpegoraro_07.pkg06.pkg2023;

/**
 *
 * @author 12303449693
 */
abstract public class Veiculo {

    private String modelo;
    private String marca;
    private int ano;
    private double preco;
    private String cor;
    private Endereco end;

    public Veiculo(String modelo, String marca, int ano, double preco, String cor, Endereco end) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
        this.cor = cor;
        this.end = end;
    }
    
    abstract void mover();
    abstract void parar();
    public void dadosVeiculo(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Preco: " + this.getPreco());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Endereco: " + end.getRua() + "\nNumero: " + end.getNumero() + "\nBairro: " + end.getBairro());
    }
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

   
    
}
