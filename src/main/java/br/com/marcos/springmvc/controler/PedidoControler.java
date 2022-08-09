package br.com.marcos.springmvc.controler;

import br.com.marcos.springmvc.dto.NovoPedidoDTO;
import br.com.marcos.springmvc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("pedido")
public class PedidoControler {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/formulario")
    public String formulario(NovoPedidoDTO novoPedidoDTO) {
        return "pedido/formulario";
    }

    @PostMapping("/novo")
    public String novo(@Valid NovoPedidoDTO novoPedidoDTO, BindingResult result) {

        if (result.hasErrors()) {

            return "pedido/formulario";
        }

        var pedido = novoPedidoDTO.toPedido();
        pedidoService.criar(pedido);
        return "redirect:/home";
    }
}
