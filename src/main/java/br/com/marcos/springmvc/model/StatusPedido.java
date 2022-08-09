package br.com.marcos.springmvc.model;

import java.util.Arrays;

public enum StatusPedido {
    AGUARDANDO("aguardando"),
    APROVADO("aprovado"),
    ENTREGUE("entregue");

    private String status;

    StatusPedido(String status) {
        this.status = status;
    }

    public static StatusPedido fromValor(String valor) {
            return Arrays.stream(StatusPedido.values())
                .filter(StatusPedido -> StatusPedido.status.equals(valor))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Status de pedido não encontrado"));
    }
}
