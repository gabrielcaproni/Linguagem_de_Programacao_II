/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casa;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Porta {
    
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    
    public Porta(String cor, int dimX, int dimY, int dimZ) {
        this.cor = cor;
        this.dimensaoX = dimX;
        this.dimensaoY = dimY;
        this.dimensaoZ = dimZ;
    }
    
    /**
     * @return the aberta
     */
    public boolean isAberta() {
        return aberta;
    }

    /**
     * @param aberta the aberta to set
     */
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
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

    /**
     * @return the dimensaoX
     */
    public double getDimensaoX() {
        return dimensaoX;
    }

    /**
     * @param dimensaoX the dimensaoX to set
     */
    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    /**
     * @return the dimensaoY
     */
    public double getDimensaoY() {
        return dimensaoY;
    }

    /**
     * @param dimensaoY the dimensaoY to set
     */
    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    /**
     * @return the dimensaoZ
     */
    public double getDimensaoZ() {
        return dimensaoZ;
    }

    /**
     * @param dimensaoZ the dimensaoZ to set
     */
    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    public boolean estaAberta(){
        return aberta;  
    }
            
    
    public void abre(){
        if(this.estaAberta()){
        System.out.println("A porta esta aberta!");
        return;
        }
        this.setAberta(true);
        System.out.println("Porta aberta.");
    }    
    
    public void fecha(){
        if(!this.estaAberta()) {
            System.out.println("A porta ja esta fechada!!!");
            return;
        }
        this.setAberta(false);
        System.out.println("Porta fechada.");
    }
    
    public void pinta(String s){
        this.setCor(s);
    }
    
    public void alteraDimensoes(double X, double Y, double Z){
        this.setDimensaoX(X);
        this.setDimensaoY(Y);
        this.setDimensaoZ(Z);
    }
    public void ImprimirPorta(){
        System.out.println("Porta: cor " + this.getCor() + "Dimensao X " + this.getDimensaoX() + "Dimensao Y "
                                         + this.getDimensaoY() + "Dimensao Z " + this.getDimensaoZ() + ", Aberta = " + this.isAberta());
    }

   
}
