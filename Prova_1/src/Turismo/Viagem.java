/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Turismo;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Viagem {
    
    private String destino;
    private Double valorKM;
    private Double valorViagem;
    private Double distancia;
    
    public Viagem(String Destino, Double ValorKM,Double Distancia){
        this.destino = Destino;
        this.valorKM = ValorKM;
        this.distancia = Distancia;
    }
    

    /**
     * @return the destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * @return the valorKM
     */
    public Double getValorKM() {
        return valorKM;
    }

    /**
     * @param valorKM the valorKM to set
     */
    public void setValorKM(Double valorKM) {
        this.valorKM = valorKM;
    }

    /**
     * @return the valorViagem
     */
    public Double getValorViagem() {
        return valorViagem;
    }

    /**
     * @param valorViagem the valorViagem to set
     */
    public void setValorViagem(Double valorViagem) {
        this.valorViagem = valorViagem;
    }

    /**
     * @return the distancia
     */
    public Double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }
    
    public void calcularViagem() {
        this.setValorViagem(this.getValorKM() * this.getDistancia());
    }
    
}
