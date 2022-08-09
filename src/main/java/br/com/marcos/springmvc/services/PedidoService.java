package br.com.marcos.springmvc.services;

import br.com.marcos.springmvc.model.Pedido;
import br.com.marcos.springmvc.model.StatusPedido;
import br.com.marcos.springmvc.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> listar() {
        return (List<Pedido>) repository.findAll();
    }

    public List<Pedido> ListarPorStatus(String status) {
        return repository.findByStatusEquals(StatusPedido.fromValor(status));
    }

    public void criar(Pedido pedido) {
        repository.save(pedido);
    }
}
