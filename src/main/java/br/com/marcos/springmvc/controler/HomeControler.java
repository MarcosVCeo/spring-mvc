package br.com.marcos.springmvc.controler;

import br.com.marcos.springmvc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
//
//    @GetMapping("/home/aguardando")
//    public String homeAguardando(Model model) {
//        var pedidos = pedidoService.ListarPorStatus(StatusPedido.AGUARDANDO);
//        model.addAttribute("pedidos", pedidos);
//        return "home";
//    }
//
//    @GetMapping("/home/aprovado")
//    public String homeAprovado(Model model) {
//        var pedidos = pedidoService.ListarPorStatus(StatusPedido.APROVADO);
//        model.addAttribute("pedidos", pedidos);
//        return "home";
//    }

    @GetMapping("/home/{status}")
    public String homeEntregue(@PathVariable("status") String status, Model model) {
        var pedidos = pedidoService.ListarPorStatus(status);
        model.addAttribute("pedidos", pedidos);
        model.addAttribute("status", status);
        return "home";
    }

    @ExceptionHandler(RuntimeException.class)
    public String onError() {
        return "redirect:/home";
    }
}
