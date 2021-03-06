/**
 * This file was generated by the Jeddict
 */
package org.Pedidos.modelo;

import java.util.Optional;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author usuario
 */
@Entity
public class Representante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String nome;

    @Basic
    private long cpf;

    @ManyToOne(targetEntity = Venda.class)
    private Venda venda;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Optional<Long> getCpf() {
        return Optional.ofNullable(this.cpf);
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Venda getVenda() {
        return this.venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

}
