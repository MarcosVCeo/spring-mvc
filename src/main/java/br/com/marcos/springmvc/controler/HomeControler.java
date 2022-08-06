package br.com.marcos.springmvc.controler;

import br.com.marcos.springmvc.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Controller
public class HomeControler {

    @GetMapping("/home")
    public String home(Model model) {
        var pedido = new Pedido("Kindle",
                BigDecimal.valueOf(426.55),
                LocalDate.now(),
                "https://www.amazon.com.br/dp/B07FQK1TS9?tag=hydrbrgk-20&ref=pd_sl_6doi8f7bq8_e",
                "https://m.media-amazon.com/images/I/51ij0YhqZTS._AC_SX679_.jpg",
                "Aparelho para leitura de livros digitais");

        var pedidos = Arrays.asList(pedido);

        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
