/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trasporto;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Carreta {
    
    private String cor;
    private String modeloCarreta;
    
    public Carreta(String modelo){
        this.modeloCarreta = modelo;
    }
     
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the modeloCarreta
     */
    public String getModeloCarreta() {
        return modeloCarreta;
    }

    /**
     * @param modeloCarreta the modeloCarreta to set
     */
    public void setModeloCarreta(String modeloCarreta) {
        this.modeloCarreta = modeloCarreta;
    }
   
    
  
}
