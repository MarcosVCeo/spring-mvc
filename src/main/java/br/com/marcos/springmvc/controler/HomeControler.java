package br.com.marcos.springmvc.controler;

import br.com.marcos.springmvc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/home")
    public String home(Model model) {
        var pedidos = pedidoService.listar();
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
