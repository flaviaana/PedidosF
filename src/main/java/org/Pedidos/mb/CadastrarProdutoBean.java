/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Pedidos.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.Pedidos.dao.ProdutoDAO;
import org.Pedidos.modelo.Produto;

@Named(value = "cadastrarProdutoBean")  //apelido da classe
@RequestScoped //acao
public class CadastrarProdutoBean {

    Produto produto = new Produto();

    @Inject
    ProdutoDAO produtoDAO;

    public void adicionar() {
        produtoDAO.salvar(produto);
//        Produto produto = new Produto();
        System.out.println(produto);//vai pegar o produto da tela e depois adicion
    }

    public Produto getProduto() {
        return produto;
    }

}
