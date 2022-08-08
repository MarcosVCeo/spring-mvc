package br.com.marcos.springmvc.repository;

import br.com.marcos.springmvc.model.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {

}
