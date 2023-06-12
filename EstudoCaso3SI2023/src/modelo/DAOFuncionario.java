/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
  
    public class DAOFuncionario { // Data Acess Object
   
    DAOCidade objDAOCidade = new DAOCidade();
    
    public List<Funcionario> getLista(){
        String sql = "select * from funcionario";
        List<Funcionario> lista = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Funcionario obj = new Funcionario();
                obj.setCodigoFuncionario(rs.getInt("Codigo"));
                obj.setNomeFuncionario(rs.getString("Nome"));
                obj.setSalarioFuncionario(rs.getDouble("Salario"));
                
                java.sql.Date dt = rs.getDate("Nascimento");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                obj.setNascimentoFuncionario(c);
                obj.setObjCidade(objDAOCidade.localizar(rs.getInt("Cidade")));
                
                lista.add(obj);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro de SQL: "+ex.getMessage());
        }
        return lista;
    }
}
    

    
    
    

