package br.com.marcos.springmvc.repository;

import br.com.marcos.springmvc.model.Pedido;
import br.com.marcos.springmvc.model.StatusPedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

    List<Pedido> findByStatusEquals(StatusPedido statusPedido);

}
