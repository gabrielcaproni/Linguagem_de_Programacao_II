/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contasPagas;

/**
 *
 * @author Gabriel Pegoraro
 */
public class Programa {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        Produto produto1 = new Produto();
        Cliente cliente1 = new Cliente();
    
        Conta conta2 = new Conta();
        Produto produto2 = new Produto();
        Cliente cliente2 = new Cliente();
    
        
        cliente1.setCpf("123.456.789-10");
        cliente1.setNomeCliente("Tulio");
        produto1.setDescricaoProduto("Notebook Dell Core I7");
        produto1.setValorProduto(1500.89);
        conta1.setCli(cliente1);
        conta1.setPro(produto1);
        conta1.setDataPagamento("03/07/2011");
        conta1.setDataVencimento("05/07/2011");
        conta1.setIdConta(1);
        
        cliente2.setCpf("987.654.321-01");
        cliente2.setNomeCliente("Daniela");
        produto2.setDescricaoProduto("TV LED 42");
        produto2.setValorProduto(2545.99);
        conta2.setCli(cliente2);
        conta2.setPro(produto2);
        conta2.setDataPagamento("01/07/2012");
        conta2.setDataVencimento("30/06/2012");
        conta2.setIdConta(2);
        
        conta1.visualizarConta();
        System.out.println("");
        conta2.visualizarConta();
    }
}
