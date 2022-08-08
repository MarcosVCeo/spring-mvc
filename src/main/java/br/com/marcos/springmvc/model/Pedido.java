package br.com.marcos.springmvc.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nomeProduto;
    private BigDecimal valor;
    private LocalDate dataEntrega;
    private String ulrProduto;
    private String urlImagem;
    private String descricao;

    public Pedido() {

    }

    public Pedido(String nomeProduto, BigDecimal valor, LocalDate dataEntrega, String ulrProduto, String urlImagem, String descricao) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
        this.dataEntrega = dataEntrega;
        this.ulrProduto = ulrProduto;
        this.urlImagem = urlImagem;
        this.descricao = descricao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getUlrProduto() {
        return ulrProduto;
    }

    public void setUlrProduto(String ulrProduto) {
        this.ulrProduto = ulrProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
