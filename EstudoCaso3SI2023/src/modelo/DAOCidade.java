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
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author tulio
 */
public class DAOCidade { // Data Acess Object
   
    public List<Cidade> getLista() throws SQLException{
        String sql = "select * from cidade";
        List<Cidade> listaCidade = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Cidade objCidade = new Cidade();
                objCidade.setCodigoCidade(rs.getInt("codigo"));
                objCidade.setNomeCidade(rs.getString("nome"));
                objCidade.setUfCidade(rs.getString("uf"));
                listaCidade.add(objCidade);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro  de SQL: " + ex.getMessage());
        }
        return Dados.listaCidade;
    }
    
    public boolean salvar(Cidade obj){
        if(obj.getCodigoCidade()==null){
            Integer codigo = Dados.listaCidade.size() +1;
            obj.setCodigoCidade(codigo);
            Dados.listaCidade.add(obj);
        }
        return true;
    }
    
    public boolean remover(Cidade obj){
        Dados.listaCidade.remove(obj);
        return true;
    }    

}
    

    
    
    

