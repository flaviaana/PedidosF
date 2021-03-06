/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Pedidos.mb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.Pedidos.dao.ProdutoDAO;
import org.Pedidos.modelo.Produto;

/**
 *
 * @author usuario
 */

@Named(value = "ListarProdutos")
@RequestScoped
public class ListarProdutosBean {
    @Inject
    private ProdutoDAO dao;
    private List<Produto> produto;

    @PostConstruct
    private void init(){
        this.produto = dao.buscarTodos();
    }
    
    public List<Produto> getProdutos() {
        return produto;
    }
    
}