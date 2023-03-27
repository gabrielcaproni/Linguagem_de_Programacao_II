/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Gerente extends Funcionario{

    private int senha;
    private int numeroFuncionariosGerenciados;
    
    @Override
    public double getBonifica(){
        return super.getBonifica() + 1000;
    }
    
    public boolean autentica(int senha){
        
        if(this.getSenha() == senha){
            System.out.println("Acesso permitido");
            return true;
        }else{
            System.out.println("Acesso negado");
            return false;
        }
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

    /**
     * @return the numeroFuncionariosGerenciados
     */
    public int getNumeroFuncionariosGerenciados() {
        return numeroFuncionariosGerenciados;
    }

    /**
     * @param numeroFuncionariosGerenciados the numeroFuncionariosGerenciados to set
     */
    public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
        this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
    }
}
