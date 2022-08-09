package br.com.marcos.springmvc.dto;

import br.com.marcos.springmvc.model.Pedido;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDate;

public class NovoPedidoDTO {

    @NotBlank
    public String nomeProduto;

    @NotBlank
    public String urlProduto;

    @NotBlank
    public String urlImagem;
    public String descricao;

    public NovoPedidoDTO() {
    }

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
