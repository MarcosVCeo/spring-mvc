package br.com.marcos.springmvc.controler;

import br.com.marcos.springmvc.dto.NovoPedidoDTO;
import br.com.marcos.springmvc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoControler {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/formulario")
    public String formulario() {

        return "pedido/formulario";
    }

    @PostMapping("/novo")
    public String novo(NovoPedidoDTO request) {
        var pedido = request.toPedido();
        pedidoService.criar(pedido);
        return "/pedido/formulario";
    }
}
