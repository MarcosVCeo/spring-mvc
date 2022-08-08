package br.com.marcos.springmvc.dto;

import br.com.marcos.springmvc.model.Pedido;

import java.math.BigDecimal;
import java.time.LocalDate;

public class NovoPedidoDTO {

    private String nomeProduto;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
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

    public Pedido toPedido() {
        return new Pedido(
                nomeProduto,
                BigDecimal.ZERO,
                LocalDate.now().plusDays(2),
                urlProduto,
                urlImagem,
                descricao);
    }
}
