/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

import java.util.List;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Internacao {
    private Paciente pac;
    private Enfermeiro enf;
    private Medico med;
    private String motivo;
    private double valorDia;
    private int dias;
    private Double totalInternacoes;
    private static int id  = 1;

    /**
     * @return the pac
     */
    public Paciente getPac() {
        return pac;
    }

    /**
     * @param pac the pac to set
     */
    public void setPac(Paciente pac) {
        this.pac = pac;
    }

    /**
     * @return the enf
     */
    public Enfermeiro getEnf() {
        return enf;
    }

    /**
     * @param enf the enf to set
     */
    public void setEnf(Enfermeiro enf) {
        this.enf = enf;
    }

    /**
     * @return the med
     */
    public Medico getMed() {
        return med;
    }

    /**
     * @param med the med to set
     */
    public void setMed(Medico med) {
        this.med = med;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the valorDia
     */
    public double getValorDia() {
        return valorDia;
    }

    /**
     * @param valorDia the valorDia to set
     */
    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    /**
     * @return the dias
     */
    public int getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(int dias) {
        this.dias = dias;
    }

    /**
     * @return the id
     */
    public static int getId() {
        return id;
    }

    /**
     * @param aId the id to set
     */
    public static void setId(int aId) {
        id = aId;
    }
    
    public void setTotalInternacoes(double totalInternacoes){
        this.totalInternacoes = totalInternacoes;
    }
    
    public double getTotalInternacoes(){
        return totalInternacoes;
    }
    
    Internacao (Paciente p, Enfermeiro e, Medico m, String motivo, int qntdDias, double valorDia){
        
        this.pac = p;
        this.enf = e;
        this.med = m;
        this.motivo = motivo;
        this.dias = qntdDias;
        this.valorDia = valorDia;
        calcularTotalDia();
    }
    
    void calcularTotalDia(){
        setTotalInternacoes(this.getDias()*this.getValorDia());
    }
    
    public static void relatorioInternacao(List<Internacao> listInter){
        double valorTotal=0, valor;
            
        for(Internacao internacao : listInter){
            valor=internacao.getTotalInternacoes();
            System.out.println("=-= Dados Internacao =-=");
            System.out.println("Codigo:"+internacao.getId());
            System.out.println("Paciente:"+internacao.pac.getNome());
            System.out.println("Medico:"+internacao.med.getNome());
            System.out.println("Enfermeiro:"+internacao.enf.getNome());
            System.out.println("Motivo:"+internacao.getMotivo());
            System.out.println("Quantidade de Dias:"+internacao.getDias());
            System.out.println("Valor do Dia:"+internacao.getValorDia());
            System.out.println("Total Internação:"+internacao.getTotalInternacoes());
            System.out.println("--------------");
            valorTotal += valor;
        }
        System.out.println("Valor Todas Internações do Hospital:"+valorTotal);
    }
    
    public static void internacaoPaciente(Paciente p, List<Internacao> listInter){
        double valorTotal=0, valor;
        System.out.println("=-= Internações do Paciente =-=");
        System.out.println(p.getNome());
        for(Internacao internacao : listInter){
            if(p.getCodPaciente() == internacao.pac.getCodPaciente()){
                valor=internacao.getTotalInternacoes();
                System.out.println("=-= Dados Internacao =-=");
                System.out.println("Codigo:"+internacao.getId());
                System.out.println("Medico:"+internacao.med.getNome());
                System.out.println("Enfermeiro:"+internacao.enf.getNome());
                System.out.println("Motivo:"+internacao.getMotivo());
                System.out.println("Quantidade de Dias:"+internacao.getDias());
                System.out.println("Valor do Dia:"+internacao.getValorDia());
                System.out.println("Total Internação:"+internacao.getTotalInternacoes());
                System.out.println("--------------");
                valorTotal += valor;
            }
        }
        System.out.println("Valor Todas Internações:"+valorTotal);
        System.out.println("-----------------");
    }
}
    

