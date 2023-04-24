/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Gabriel Pegoraro
 */
public class DAOFuncionario {
    public static List<Funcionario> getList(){
        return Dados.ListaFuncionario;
    }
    
    public boolean salvar(Funcionario obj){
        if(obj.getCodigoFuncionario()== null){
            Integer codigo = Dados.ListaFuncionario.size() +1;
            obj.setCodigoFuncionario(codigo);
            Dados.ListaFuncionario.add(obj);
        }
        return true;
    }
    
    public boolean remover(Cidade obj){
        Dados.ListaFuncionario.remove(obj);
        return true;
    }
}
